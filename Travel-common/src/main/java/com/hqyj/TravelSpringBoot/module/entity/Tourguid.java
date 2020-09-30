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
@Table(name = "tourguid")
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

    public int getTourguidId() {
        return tourguidId;
    }

    public void setTourguidId(int tourguidId) {
        this.tourguidId = tourguidId;
    }

    public String getTourguidName() {
        return tourguidName;
    }

    public void setTourguidName(String tourguidName) {
        this.tourguidName = tourguidName;
    }

    public String getTourguidSex() {
        return tourguidSex;
    }

    public void setTourguidSex(String tourguidSex) {
        this.tourguidSex = tourguidSex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTourguidTel() {
        return tourguidTel;
    }

    public void setTourguidTel(String tourguidTel) {
        this.tourguidTel = tourguidTel;
    }

    public int getTourguidState() {
        return tourguidState;
    }

    public void setTourguidState(int tourguidState) {
        this.tourguidState = tourguidState;
    }

    public String getTourguidDescribe() {
        return tourguidDescribe;
    }

    public void setTourguidDescribe(String tourguidDescribe) {
        this.tourguidDescribe = tourguidDescribe;
    }

    public List<Route> getRouteId() {
        return routeId;
    }

    public void setRouteId(List<Route> routeId) {
        this.routeId = routeId;
    }
}