<script type="text/javascript">
    $(document).ready(function() {
        initUserTable(DEFAULT_PAGE_SIZE);

        $("#addUserBtn").bind("click", function() {
            intAddModal();
        });

        $("#insertUserBtn").bind("click", function() {
            addUser();
        });

        $("#editUserBtn").bind("click", function() {
            editUser();
        });
    });

    function initUserTable(pageSize) {
        $('#datatable').DataTable({
            'paging': true, //分页
            "serverSide": true, //开启后端分页
            "pagingType": "full_numbers", //分页样式的类型simple/simple_numbers/full/full_numbers
            "pageLength": pageSize, //定义初始的页长
            "processing": true,
            "destroy": true, //允许销毁替换，在表格重新查询时，可以自动销毁以前的data
            'lengthChange': true, //控制是否能够调整每页的条数
            'searching': true,
            'data-show-refresh': true,
            'ordering': true,
            'autoWidth': false,
            "ajax": function (data, callback, settings) {
                // 从data获取查询数据
                var columIndex = data.order[0].column;
                var sort = data.order[0].dir;
                var orderBy = data.columns[columIndex].name;
                pageSize = data.length == undefined  ? pageSize : data.length;

                var searchVo = {};
                searchVo.currentPage = (data.start / pageSize) + 1;
                searchVo.pageSize = pageSize;
                searchVo.orderBy = orderBy;
                searchVo.sort = sort;
                searchVo.keyWord = data.search.value;

                $.ajax({
                    url : "/user/users",
                    type : "post",
                    contentType: "application/json",
                    data : JSON.stringify(searchVo),
                    success : function (rs) {
                        var fData = {
                            draw :0,
                            recordsTotal: 0,
                            recordsFiltered: 0,
                            data: []
                        };
                        if (!rs) {
                            layer.alert("请求出错，请稍后重试" + rs.errmsg, {icon: 2});
                            callback(fData);
                            return;
                        };
                        if (rs.list == null) {
                            $('#datatable tbody tr').remove();
                            $('#loading').remove();
                            callback(fData);
                            return;
                        }
                        $('#loading').remove();
                        var gearDatas = [];
                        for (var i = 0; i < rs.list.length; i++) {
                            //包装行数据
                            var rowData = new TData(rs.list[i].userId, rs.list[i].userName,
                                rs.list[i].password, rs.list[i].createDate);
                            // 将行数据放到数组里
                            gearDatas.push(rowData);
                        }
                        fData.data = gearDatas;
                        fData.recordsTotal = rs.total;
                        fData.recordsFiltered = rs.total;
                        callback(fData);
                    },
                    error : function (data) {
                        layer.alert(data.responseText, {icon: 0});
                    }
                });
            },
            "columns": [ //定义行数据字段
                {data: 'userId', name: "user_id", sortable: true},
                {data: 'userName', name: "user_name", sortable: true},
                {data: 'password', name: "password", sortable: true},
                {data: 'createDate', name: "create_date", sortable: true},
                {data: 'operate', width: '80px', sortable: false}
            ]
        });
    }
    //行数据结构
    function TData(userId, userName, password, createDate) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.createDate = createDate;
        this.operate = function () {
            return "<a href='#' class='btn_editcolor' data-toggle='modal' data-target='#userEditModal' " +
                "onclick='initEditModal(\"" + userId + "\")'>编辑</a>&nbsp;" +
                "<a href='javascript:void(0);' onclick='deleteUser(\"" + userId + "\")' class='btn_editcolor'>删除</a>";
        }
    }

    function initRoles(rolesDivId) {
        $.ajax({
            url : "/role/roles",
            type : "get",
            success : function (rs) {
                var rolesDiv = $("#" + rolesDivId);
                $.each(rs, function(i, item) {
                    rolesDiv.append("<input type='checkbox' value='"
                        + item.roleId + "'/>" + item.roleName + " ");
                });
            },
            error : function (data) {
                layer.alert(data.responseText, {icon: 0});
            }
        });
    }

    function intAddModal() {
        $("#userNameForAddPage").val("");
        $("#passwordForAddPage").val("");
        initRoles("rolesForAddPage", "roleElementForAdd");
    }

    function addUser() {
        var user = {};
        user.userName = $("#userNameForAddPage").val();
        user.password = $("#passwordForAddPage").val();
        var roles = new Array();
        $.each($("input[name='roleElementForAdd']"), function(){
            if(this.checked){
                var role = {};
                role.roleId = $(this).val();
                roles.push(role);
            }
        });
        user.roles = roles;

        $.ajax({
            url : "/login/post",
            type : "post",
            contentType: "application/json",
            data : JSON.stringify(user),
            success : function (rs) {
                if (rs.status == 200) {
                    initUserTable(DEFAULT_PAGE_SIZE);
                } else {
                    layer.alert(rs.messgae, {icon: 0});
                }
            },
            error : function (data) {
                layer.alert(data.responseText, {icon: 0});
            }
        });
    }

    function initEditModal(userId) {
        initRoles("rolesForEditPage", "roleElementForEdit");

        $.ajax({
            url : "/user/get/" + userId,
            type : "get",
            success : function (rs) {
                $("#userIdForEditPage").val(rs.userId);
                $("#userNameForEditPage").val(rs.userName);
                $("#userImgForEditPage").val(rs.userImg);
                $.each(rs.roles, function(i, item){
                    $("input[name='roleElementForEdit'][value=" + item.roleId + "]")
                        .attr("checked","checked");
                });
            },
            error : function (data) {
                layer.alert(data.responseText, {icon: 0});
            }
        });
    }

    function editUser() {
        var user = {};
        user.userId = $("#userIdForEditPage").val();
        user.userName = $("#userNameForEditPage").val();
        user.userImg = $("#userImgForEditPage").val();
        var roles = new Array();
        $.each($("input[name='roleElementForEdit']"), function(){
            if(this.checked){
                var role = {};
                role.roleId = $(this).val();
                roles.push(role);
            }
        });
        user.roles = roles;

        $.ajax({
            url : "/user/put",
            type : "put",
            contentType: "application/json",
            data : JSON.stringify(user),
            success : function (rs) {
                if (rs.status == 200) {
                    initUserTable(DEFAULT_PAGE_SIZE);
                } else {
                    layer.alert(rs.messgae, {icon: 0});
                }
            },
            error : function (data) {
                layer.alert(data.responseText, {icon: 0});
            }
        });
    }

    function deleteUser(userId) {
        bootbox.confirm("Are you sure?", function(result) {
            if(result) {
                $.ajax({
                    url : "/user/" + userId,
                    type : "delete",
                    success : function (data) {
                        if (data.status == 200) {
                            initUserTable(DEFAULT_PAGE_SIZE);
                        } else {
                            window.location.href = data.object;
                            // layer.msg(data.message, {icon: 0});
                        }
                    },
                    error : function (data) {
                        layer.msg(data.responseText, {icon: 0});
                    }
                });
            }
        });
    }
</script>