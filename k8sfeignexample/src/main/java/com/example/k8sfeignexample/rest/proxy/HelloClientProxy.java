package com.example.k8sfeignexample.rest.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="k8-image-service",fallback=HelloClientFallback.class)
public interface HelloClientProxy {
	
	@GetMapping("/message/fetch")
	public String getMessage();

}
