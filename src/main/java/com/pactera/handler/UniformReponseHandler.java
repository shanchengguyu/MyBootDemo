package com.pactera.handler;

import com.pactera.domain.CallResultMsg;
import com.pactera.enumPackage.CodeAndMsg;
import com.pactera.exception.MyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author James
 * @date 2021/5/8
 * @decription
 */
@RestControllerAdvice
public class UniformReponseHandler<T> {
//	@ResponseStatus(HttpStatus.OK)
//	public CallResultMsg sendSuccessResponse(){
//		return new CallResultMsg(true, CodeAndMsg.SUCCESS.getMsg(), null);
//	}
//
//	@ResponseStatus(HttpStatus.OK)
//	public CallResultMsg sendSuccessResponse(T data) {
//		return new CallResultMsg(true, CodeAndMsg.SUCCESS.getMsg(), data);
//	}

	@ExceptionHandler(value = MyException.class)
	public CallResultMsg sendErrorResponse_UserDefined(MyException exception){
		return new CallResultMsg(false, exception.getCode(),exception.getMsg(), null);
	}

	@ExceptionHandler(Exception.class)
	public CallResultMsg sendErrorResponse_System(Exception exception){
		if (exception instanceof MyException) {
			return this.sendErrorResponse_UserDefined((MyException) exception);
		}
		return new CallResultMsg(false,CodeAndMsg.EXCEPTION.getCode(),CodeAndMsg.EXCEPTION.getMsg(), null);
	}

//	public static void main(String[] args) {
//		RuntimeException exception=new RuntimeException();
//	}
}
