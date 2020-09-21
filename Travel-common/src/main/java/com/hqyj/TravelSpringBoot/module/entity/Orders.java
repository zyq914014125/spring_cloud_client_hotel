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
@Table(name = "orders")
public class Orders implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    private String orderInfo;
    @Transient
    private int userId;
}
