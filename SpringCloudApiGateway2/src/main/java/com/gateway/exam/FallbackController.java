package com.gateway.exam;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import javax.naming.ServiceUnavailableException;
import java.rmi.ServerException;

@Slf4j
@RestController
@RequestMapping("/fallback")
public class FallbackController {

    @GetMapping("/authFaliure")
    public String authService(ServerHttpRequest request, ServerHttpResponse response) {
        log.info("auth-service fallback ...............");
        return "auth-service fallback ...............";
    }
}