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
public class Scenery implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sceneryId;
    private String sceneryName;
    private String sceneryAddress;
    private String sceneryStar;
    private String imgUrl;
    private double ticketPrice;
    private String sceneryDescribe;
}
