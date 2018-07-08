package com.sgang.learning.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/***
 * 使用AspectJ实现AOP.
 * <p>
 * 使用注解的方式，实现AspectJ，使用@Aspect注解必须配合@Component，否则无法使用自动注入.
 * 在此类中可以定义Advice（通知）和Pointcut（切入点）.
 * 
 * @author zj_home
 *
 */

@Component
@Aspect
public class SgangAspect {

}
