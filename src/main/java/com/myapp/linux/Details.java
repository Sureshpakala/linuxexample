package com.myapp.linux;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Details {
	@GetMapping(value="/message")
	public String data() {
		return "This is a message";
	}
}
