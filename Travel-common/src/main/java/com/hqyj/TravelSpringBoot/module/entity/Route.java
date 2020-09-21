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
@Table(name="route")
public class Route implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int routeId;
    private String sceneryIdList;
    private String routeName;
    private double totalPrice;
//    @Transient
//    private List<Integer> seceneryId;



}
