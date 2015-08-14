package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target; 
 

/**
 * @author baoyou  E-mail:curiousby@163.com
 * @version ����ʱ�䣺2015��7��23�� ����2:54:47 
 * des:
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
	String value();
}
