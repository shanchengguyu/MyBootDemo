//package com.pactera.annotation;
//
//import com.pactera.annotation.methods4Annotation.Methosd1;
//import java.lang.annotation.Documented;
//import java.lang.annotation.ElementType;
//import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;
//import java.lang.annotation.Target;
//import javax.validation.Constraint;
//import javax.validation.Payload;
//
///**
// * @author James
// * @date 2021/4/30
// * @decription
// */
//
//@Target({ElementType.METHOD, ElementType.FIELD,ElementType.PARAMETER})
//@Retention(RetentionPolicy.RUNTIME)
////代表处理逻辑是MyConstraintValidator类
//@Constraint(validatedBy = {Methosd1.class})
//@Documented
//public @interface MyAnnotation {
//	Class<?>[] groups() default {};
//
//	String message() default "-----";
//
//	Class<? extends Payload>[] payload() default {};
//}
