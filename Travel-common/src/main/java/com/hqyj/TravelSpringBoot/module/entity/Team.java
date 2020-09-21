package com.hqyj.TravelSpringBoot.module.entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author yjq
 * @date 2020/09/14
 */
@Data
@Entity
@Table(name="team")
public class Team implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer teamId;
    private String teamName;
    private Integer endTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date sendTime;

    @Transient
    private List<User> userId;
    @Transient
    private int tourguidId;
    @Transient
    private int routeId;
    @Transient
    private int carId;

}
