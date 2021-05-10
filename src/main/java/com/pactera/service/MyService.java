package com.pactera.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pactera.domain.Student;
import com.pactera.mapper.MyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author James
 * @date 2021/5/8
 * @decription
 */
@Service
public class MyService {

	@Autowired
	private MyMapper myMapper;

	/**
	 * 根据id获取指定的学生数据
	 *
	 * @param id
	 * @return
	 */
	public Student getOne(String id) {
		Student student = myMapper.selectOne(new QueryWrapper<Student>().eq(
				"id", Integer.parseInt(id)).ne("sex", "女"));
		return student;
	}
}
