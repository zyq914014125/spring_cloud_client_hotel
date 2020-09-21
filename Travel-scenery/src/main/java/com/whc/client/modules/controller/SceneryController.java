package com.whc.client.modules.controller;


import com.github.pagehelper.PageInfo;
import com.hqyj.TravelSpringBoot.module.Serach.Result;
import com.hqyj.TravelSpringBoot.module.Serach.Serachvo;
import com.hqyj.TravelSpringBoot.module.entity.Scenery;
import com.whc.client.modules.service.SceneryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName: SceneryController <br/>
 * Description: <br/>
 * date: 2020/9/15 10:47<br/>
 *
 * @author FEI FEI<br/>
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/api")
public class SceneryController {

    @Autowired
    private SceneryService sceneryService;

    /**
     * 127.0.0.1:8110/api/scenery ---post
     * {"sceneryName":"北京大学","sceneryLevel":"AAAAA","ticketPrice":"50","imgUrl":"123546",
     * "sceneryAddress":"北京","sceneryDescribe":"北京的大学"}
     */
    @PostMapping(value = "/scenery", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Result<Scenery> addSceneryByScenery(@RequestBody Scenery scenery) {
        return sceneryService.addSceneryByScenery(scenery);
    }

    /**
     * 127.0.0.1:8110/api/scenery/59 ---delete
     */
    @DeleteMapping("/scenery/{sceneryId}")
    public Result<Scenery> deleteSceneryBySceneryId(@PathVariable int sceneryId) {
        return sceneryService.deleteSceneryBySceneryId(sceneryId);
    }

    /**
     * 127.0.0.1:8110/api/scenery ---put
     * {"sceneryName":"清华大学","sceneryLevel":"AAAAA","ticketPrice":"50","imgUrl":"123546","sceneryAddress":"北京","sceneryDescribe":"北京的大学","sceneryId":"53"}
     */
    @PutMapping(value = "/scenery", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Result<Scenery> updateSceneryByScenery(@RequestBody Scenery scenery) {
        return sceneryService.updateSceneryByScenery(scenery);
    }

    /**
     * 127.0.0.1:8110/api/sceneries ---post
     * {"currentPage":"1","pageSize":"5","keyWord":"成都"}
     */
    @PostMapping(value = "/sceneries", consumes = MediaType.APPLICATION_JSON_VALUE)
    public PageInfo<Scenery> getSceneryBySearchVo(@RequestBody Serachvo serachvo) {
        return sceneryService.getSceneryBySearchVo(serachvo);
    }

    /**
     * 127.0.0.1:8110/api/scenery/30 ---get
     */
    @GetMapping("/scenery/{sceneryId}")
    public Result<Scenery> getSceneryBySceneryId(@PathVariable int sceneryId) {
        return sceneryService.getSceneryBySceneryId(sceneryId);
    }

}
