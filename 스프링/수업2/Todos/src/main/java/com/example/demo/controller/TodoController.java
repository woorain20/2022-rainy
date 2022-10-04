//package com.example.demo.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.dto.Todo;
//import com.example.demo.repository.TodoRepository;
//
//@RestController		//json으로 형태 자동변환
//public class TodoController {
//
//	@Autowired
//	TodoRepository todoRepository;
//	
//	//전체 데이터 조회
//	@GetMapping("/todos")	//기본주소를 dto의 복수형태로 많이 씀
//	public List<Todo> getTodos() {
//		return todoRepository.findAll();
//	}
//	
//	//삽입
//	@PostMapping("/todos")
//	public Todo addTodo(@RequestBody Todo todo) {	//form으로 받을 때는 ModelAttribute  json을 위해서는 RequestBody
//		return todoRepository.save(todo);
//	}
//	
//
//}
