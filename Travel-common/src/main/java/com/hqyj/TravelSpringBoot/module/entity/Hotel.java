package com.hqyj.TravelSpringBoot.module.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * describe:
 *
 * @author yjq
 * @date 2020/09/14
 */
@Data
@Entity
@Table(name="hotel")
public class Hotel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hotelId;
    private String hotelName;
    private int hotelCost;
    @Transient
    private int sceneryId;

}

