package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCont {

	/**
	 * 
	 * @return
	 */
	@RequestMapping("/ff")
	public @ResponseBody User g()
	{
		return new User("Fikir","Stable");
	}
}


class User
{
	String name;
	String status;
	public User(String name, String status) {
		super();
		this.name = name;
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
