package com.pactera.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * @author James
 * @date 2021/5/7
 * @decription
 */
@TableName(value = "student")
@Data
public class Student {
	
	@TableId
	private int id;
	
	@NotNull
	private String name;
	
	@NotNull
	private String sex;
	
	@NotNull
	private int age;
	
}
