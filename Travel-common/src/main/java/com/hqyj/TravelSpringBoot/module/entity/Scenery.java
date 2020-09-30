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
@Table(name = "user")
public class Scenery implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sceneryId;
    private String sceneryName;
    private String sceneryAddress;
    private String sceneryLevel;
    private String imgUrl;
    private double ticketPrice;
    private String sceneryDescribe;

    public int getSceneryId() {
        return sceneryId;
    }

    public void setSceneryId(int sceneryId) {
        this.sceneryId = sceneryId;
    }

    public String getSceneryName() {
        return sceneryName;
    }

    public void setSceneryName(String sceneryName) {
        this.sceneryName = sceneryName;
    }

    public String getSceneryAddress() {
        return sceneryAddress;
    }

    public void setSceneryAddress(String sceneryAddress) {
        this.sceneryAddress = sceneryAddress;
    }

    public String getSceneryLevel() {
        return sceneryLevel;
    }

    public void setSceneryLevel(String sceneryLevel) {
        this.sceneryLevel = sceneryLevel;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getSceneryDescribe() {
        return sceneryDescribe;
    }

    public void setSceneryDescribe(String sceneryDescribe) {
        this.sceneryDescribe = sceneryDescribe;
    }
}
