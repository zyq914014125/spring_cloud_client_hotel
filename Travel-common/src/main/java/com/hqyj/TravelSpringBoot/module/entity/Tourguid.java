package com.hqyj.TravelSpringBoot.module.entity;

import com.hqyj.TravelSpringBoot.module.entity.Route;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * describe:
 *
 * @author yjq
 * @date 2020/09/14
 */
@Data
@Entity
@Table(name="tourguid")
public class Tourguid implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tourguidId;
    private String tourguidName;
    private String tourguidSex;
    private int age;
    private String tourguidTel;
    private int tourguidState;
    private String tourguidDescribe;
    @Transient
    private List<Route> routeId;

}