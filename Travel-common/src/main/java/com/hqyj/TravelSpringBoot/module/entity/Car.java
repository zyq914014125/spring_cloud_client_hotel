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
@Table(name="car")
public class Car implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int carId;
    private int carNum;
    private int carState;

}
