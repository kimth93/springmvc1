package kr.ac.skuniv.springmvc.dao;

import java.util.List;

import kr.ac.skuniv.springmvc.dto.Todo;
import kr.ac.skuniv.springmvc.mapper.Mapper;

@Mapper	//정의한 mapper
public interface TodoMapper {
	//메서드 정의
	public Todo getTodo(int id); 	//id와 동일한 이름!
	public List<Todo> getTodos();
}
