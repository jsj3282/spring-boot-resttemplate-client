package com.example.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.client.dto.Req;
import com.example.client.dto.UserResponse;
import com.example.client.service.RestTemplateService;

@RestController
@RequestMapping("/api/client")
public class ApiController {

    private final RestTemplateService restTemplateService;

    public ApiController(RestTemplateService restTemplateService) {
        this.restTemplateService = restTemplateService;
    }

    @GetMapping("/hello")
    public UserResponse getHello() {
        return restTemplateService.hello();
    }

    @GetMapping("/hello2")
    public UserResponse post() {
        restTemplateService.post();
        return new UserResponse();
        // return restTemplateService.post();
    }

    @GetMapping("/hello3")
    public UserResponse exchange() {
        return restTemplateService.exchange();
    }

    @GetMapping("/hello4")
    public Req<UserResponse> genericExchange() {
        return restTemplateService.genericExchange();
    }
}
