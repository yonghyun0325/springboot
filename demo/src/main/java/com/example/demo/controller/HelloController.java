package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//Controller의 역할: 사용자의 요청정보를 받아서 처리할 수 있는 자바클래스
//RestController: REST API에 의한 요청에 대해 처리할 수 있는 자바클래스
//사용자로부터 전달된 JSON 표기의 객체를 Java객체로 변환시켜주고
//Java객체를 JSON표기의 객체로 변환시켜주는 역할도 함
public class HelloController {

	@GetMapping("/hello")
	//사용자가 Get방식으로 보낸 요청에 대해서 처리해주는 어노테이션
	public String hello() {
		return "Hello, Springboot!";
	}
}
