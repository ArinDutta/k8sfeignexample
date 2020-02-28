package com.example.k8sfeignexample.rest.proxy;

import org.springframework.stereotype.Component;

@Component
public class HelloClientFallback implements HelloClientProxy{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Default Message";
	}

}
