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
@Table(name="permission")
public class Permission implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int permissionId;
    private String permissionName;
}
