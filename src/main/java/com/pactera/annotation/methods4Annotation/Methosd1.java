//package com.pactera.annotation.methods4Annotation;
//
//import com.pactera.annotation.MyAnnotation;
//import javax.validation.ConstraintValidator;
//import javax.validation.ConstraintValidatorContext;
//
///**
// * @author James
// * @date 2021/4/30
// * @decription
// */
//public class Methosd1 implements ConstraintValidator<MyAnnotation,Object> {
//
//
//	@Override
//	public void initialize(MyAnnotation constraintAnnotation) {
//
//	}
//
//	@Override
//	public boolean isValid(Object o,
//	                       ConstraintValidatorContext constraintValidatorContext) {
//		System.out.println("进入注解里面！！！");
//		if(o instanceof Integer){
//			if((Integer)0 >10){
//				System.out.println("超过了10！");
//				return true;
//			}
//		}
//		return false;
//	}
//}
