package com.yusys.springboot.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author HuYang
 * @date 2019-12-18 11:44
 * @Description 演示AOP的优先级
 *
 * 演示切面优先级：
 * 可以使用 @Order 注解指定切面的优先级, 值越小优先级越高
 *
 * 重用切点表达式：
 *
 * 定义一个方法, 用于声明切入点表达式. 一般地, 该方法中再不需要添入其他的代码.
 * 使用 @Pointcut 来声明切入点表达式.
 * 后面的其他通知直接使用方法名来引用当前的切入点表达式.
 *               	@Pointcut("execution(public int cn.tedu.spring.aop.day03.ArithmeticCalculator.*(int, int))")
public void declareJointPointExpression(){}

用的时候直接
 @Before("com.yusys.springboot.aop.BuyAop.pointcut()")
 @Around("pointcut()")

 */
@Order(1)
@Component
@Aspect
public class VlidationAspect {

    @Before("com.yusys.springboot.aop.BuyAop.pointcut()")
    public void validateArgs(JoinPoint joinPoint){
        System.out.println("--演示优先级-->validate:" + Arrays.asList(joinPoint.getArgs()));
    }
}
