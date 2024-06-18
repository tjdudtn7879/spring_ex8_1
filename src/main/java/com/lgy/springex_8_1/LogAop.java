package com.lgy.springex_8_1;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable{
		String signatureStr = joinPoint.getSignature().toShortString();
		System.out.println("@@@### start===>"+signatureStr);
		Object obj=null;
		try {
			obj = joinPoint.proceed();
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			System.out.println("@@@### end===>"+signatureStr);
		}
		
		return obj;
	}
}
