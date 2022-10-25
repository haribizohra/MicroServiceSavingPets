package com.microservice.gateway.config;

import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

@Component
public class RouterValidator {

    public static final  List<String> openApiEndpoints =Arrays.asList("/auth/signup", "/auth/signin","/users/all","/users/user",
            "/users/admin");

    public Predicate<ServerHttpRequest> isSecured =
            request -> openApiEndpoints
                    .stream()
                    .noneMatch(uri -> request.getURI().getPath().contains(uri));

}
