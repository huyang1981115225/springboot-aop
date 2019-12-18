package com.yusys.springboot.service;
import org.springframework.stereotype.Service;

/**
 * @author HuYang
 * @date 2019-12-18 10:55
 * @Description BuyService
 */
@Service
public class BuyService {

    public String buyAopBefore(Integer price,Integer money){
        System.out.println("======buyAopBefore======");
        if (money > price) {
            return "buyAopBefore -----> buy success";
        }else {
            return "buyAopBefore -----> buy fail";
        }
    }

    public String buyAopAfter(Integer price,Integer money){
        System.out.println("======buyAopAfter======");
        if (money > price) {
            return "buyAopAfter -----> buy success";
        }else {
            return "buyAopAfter -----> buy fail";
        }
    }

    public String buyAopAfterReturning(Integer price,Integer money){
        System.out.println("======buyAopAfterReturning======");
        if (money > price) {
            return "buyAopAfterReturning -----> buy success";
        }else {
            return "buyAopAfterReturning -----> buy fail";
        }
    }

    public String buyAopAfterThrowing(Integer price,Integer money){
        System.out.println("======buyAopAfterThrowing======");
        int i = 1/0;
        if (money > price) {
            return "buyAopAfterThrowing -----> buy success";
        }else {
            return "buyAopAfterThrowing -----> buy fail";
        }
    }

    public String buyAopAround(Integer price,Integer money){
        System.out.println("======buyAopAround======");
        if (money > price) {
            return "buyAopAround -----> buy success";
        }else {
            return "buyAopAround -----> buy fail";
        }
    }
}
