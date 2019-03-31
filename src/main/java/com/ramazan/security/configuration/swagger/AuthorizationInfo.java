package com.ramazan.security.configuration.swagger;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ApiImplicitParams({
        @ApiImplicitParam(name = "Authorization", value = "Request needs Authorization Token", paramType = "header", dataTypeClass = String.class, required = true),
})
public @interface AuthorizationInfo {
}