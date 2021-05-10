package com.pactera.controller;

import com.pactera.domain.Student;
import com.pactera.domain.SystermParam;
import com.pactera.enumPackage.CodeAndMsg;
import com.pactera.exception.MyException;
import com.pactera.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author James
 * @date 2021/4/28
 * @decription
 */
@RequestMapping("/myController")
@Controller
public class MyController {
	@Autowired
	private SystermParam systermParam;
	
	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Value("${myredis.name}")
	private String name;
	
	@Autowired
	private MyService myService;
	
	@GetMapping("/getName")
	@ResponseBody
	public String getName(@RequestParam Integer num){
//		stringRedisTemplate.opsForList().leftPush("name",systermParam.getName());
//		stringRedisTemplate.expire("name",10, TimeUnit.SECONDS);
//		System.out.println(stringRedisTemplate.opsForList().range("name",0,-1));
//		return "name : "+systermParam.getName();
//		return "name"+name;
		return systermParam.name;
	}

	/**
	 * 根据id获取指定的学生数据
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/getStu")
	@ResponseBody
	public Student getOne(@RequestParam(required = true) String id){
		/**
		 * {
		 *     "result": false,
		 *     "code": 4000,
		 *     "message": "SERVER EXCEPTION",
		 *     "data": null
		 * }
		 */
//		int i=1/0;

		/**
		 * {
		 *     "result": false,
		 *     "code": 3000,
		 *     "message": "THIS IS AN UNKNOW EXCEPTION",
		 *     "data": null
		 * }
		 */
		if(Integer.parseInt(id)<10){
			throw new MyException(CodeAndMsg.UNKNOWEXCEPTION);
		}
		return null;
	}
}
