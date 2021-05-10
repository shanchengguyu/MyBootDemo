package com.pactera.annotation.param;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Payload;

/**
 * @author James
 * @date 2021/5/8
 * @decription
 */
@Target({ElementType.METHOD, ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ParamCheck {
	
	Class<?>[] groups() default {};

	String message() default "-----";

	Class<? extends Payload>[] payload() default {};
	
}
