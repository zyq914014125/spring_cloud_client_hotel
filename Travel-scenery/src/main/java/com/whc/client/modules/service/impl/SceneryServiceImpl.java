package com.whc.client.modules.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hqyj.TravelSpringBoot.module.Serach.Result;
import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.Scenery;
import com.whc.client.modules.dao.SceneryDao;
import com.whc.client.modules.service.SceneryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.Optional;

/**
 * ClassName: SceneryServiceImpl <br/>
 * Description: <br/>
 * date: 2020/9/15 10:52<br/>
 *
 * @author FEI FEI<br/>
 * @since JDK 1.8
 */
@Service
public class SceneryServiceImpl implements SceneryService {
    @Autowired
    private SceneryDao sceneryDao;

    //增加
    @Override
    @Transactional
    public Result<Scenery> addSceneryByScenery(Scenery scenery) {
        Scenery scenery_db = sceneryDao.getSceneryBySceneryName(scenery.getSceneryName());
        if (scenery_db != null) {
            return new Result<Scenery>(Result.ResultState.ERROR_RESPONSE, "this scenery is exist");
        } else {
            sceneryDao.addScenery(scenery);
            return new Result<Scenery>(Result.ResultState.SUCCESS_RESPONSE, "add success", scenery);
        }
    }

    //删除
    @Override
    @Transactional
    public Result<Scenery> deleteSceneryBySceneryId(int sceneryId) {
        sceneryDao.deleteScenery(sceneryId);
        return new Result<Scenery>(Result.ResultState.SUCCESS_RESPONSE, "delete success");

    }

    //修改
    @Override
    @Transactional
    public Result<Scenery> updateSceneryByScenery(Scenery scenery) {
        sceneryDao.updateScenery(scenery);
        return new Result<Scenery>(Result.ResultState.SUCCESS_RESPONSE, "update success", scenery);
    }

    //分页查询
    @Override
    public PageInfo<Scenery> getSceneryBySearchVo(Serachvo serachvo) {
        serachvo.initSearchVo();
        PageHelper.startPage(serachvo.getCurrentPage(), serachvo.getPageSize());
        return new PageInfo<Scenery>(Optional
                .ofNullable(sceneryDao.getSceneryBySearchVo(serachvo))
                .orElse(Collections.emptyList()));
    }
    //根据id查询
    @Override
    public Result<Scenery> getSceneryBySceneryId(int sceneryId) {
        Scenery scenery = sceneryDao.getSceneryBySceneryId(sceneryId);
        if (scenery !=null){
            return new Result<Scenery>(Result.ResultState.SUCCESS_RESPONSE, "select success", scenery);
        }else {
            return new Result<Scenery>(Result.ResultState.ERROR_RESPONSE, "this scenery is not exist");
        }
    }
}
