package com.yusys.springboot.controller;

import com.yusys.springboot.service.BuyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HuYang
 * @date 2019-12-18 11:08
 * @Description BuyController
 */
@RestController
@RequestMapping("/buy")
public class BuyController {

    @Autowired
    private BuyService service;

    @RequestMapping("/before")
    public String before() {
        Integer price = 100;
        Integer money = 150;

        return service.buyAopBefore(price, money);

    }

    @RequestMapping("/after")
    public String after() {
        Integer price = 100;
        Integer money = 150;

        return service.buyAopAfter(price, money);
    }

    @RequestMapping("/afterReturning")
    public String afterReturning() {
        Integer price = 100;
        Integer money = 150;

        return service.buyAopAfterReturning(price, money);
    }

    @RequestMapping("/afterThrowing")
    public String afterThrowing() {
        Integer price = 100;
        Integer money = 150;

        return service.buyAopAfterThrowing(price, money);
    }

    @RequestMapping("/around")
    public String around() {
        Integer price = 100;
        Integer money = 150;

        return service.buyAopAround(price, money);
    }
}
