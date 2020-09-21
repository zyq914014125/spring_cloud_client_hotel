package com.hqyj.TravelSpringBoot.module.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author yjq
 * @date 2020/09/14
 */
@Data
@Entity
@Table(name="user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String userName;
    private String userPwd;
    private String salt;
    private String userSex;
    private String userAge;
    private String userIdCard;
    private String userTel;
    private int permissionId;
    private String comment;

    private int orderId;

}
