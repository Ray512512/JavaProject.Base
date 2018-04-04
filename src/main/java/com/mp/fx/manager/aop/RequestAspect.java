package com.mp.fx.manager.aop;

import com.alibaba.fastjson.JSONArray;
import com.mp.common.info.IDataList;
import com.mp.common.info.imp.DataList;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by songxs on 2017/6/21.
 */
@Component
@Aspect
public class RequestAspect {
    private final Logger log= LoggerFactory.getLogger(this.getClass());
    @Pointcut("execution(* com.mp.fx.manager.rest..*.*(..))")
    public void executeService(){

    }
    /**
     * 方法拦截
     * @param joinPoint
     */
    @Around("executeService()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable{
        long start=System.currentTimeMillis();
        //获取目标方法的参数信息
        Object[] args = joinPoint.getArgs();

        //用的最多 通知的签名
        Signature signature = joinPoint.getSignature();

        // 继续执行
        Object ret= null;

        ret = joinPoint.proceed();

        long end=System.currentTimeMillis();
        // 方法名
        String methodName=signature.getName();
        // 类名
        String className =joinPoint.getTarget().getClass().getName();
        // 去除文件字段
        IDataList argsList=new DataList();
        for(Object o:args){
            if(o instanceof MultipartFile
                    ||o instanceof MultipartRequest
                    ||o instanceof HttpServletRequest
                    ||o instanceof HttpServletResponse){
            }else{
                argsList.add(o);
            }
        }
        log.info(className+":"+methodName+": 耗时"+(end-start)+": "+ JSONArray.toJSONString(argsList));
        if(null!=ret){
            log.info(JSONArray.toJSONString(ret));
        }
        return ret;
    }

}
