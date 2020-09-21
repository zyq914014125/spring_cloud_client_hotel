package com.whc.client.modules.service;


import com.github.pagehelper.PageInfo;
import com.hqyj.TravelSpringBoot.module.Serach.Result;
import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.Scenery;

/**
 * ClassName: SceneryService <br/>
 * Description: <br/>
 * date: 2020/9/15 10:51<br/>
 *
 * @author FEI FEI<br/>
 * @since JDK 1.8
 */
public interface SceneryService {

    Result<Scenery> addSceneryByScenery(Scenery scenery);

    Result<Scenery> deleteSceneryBySceneryId(int sceneryId);

    Result<Scenery> updateSceneryByScenery(Scenery scenery);

    PageInfo<Scenery> getSceneryBySearchVo(Serachvo serachvo);

    Result<Scenery> getSceneryBySceneryId(int sceneryId);

}
