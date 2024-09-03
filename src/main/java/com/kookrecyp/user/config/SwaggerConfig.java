package com.kookrecyp.user.config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * packageName : com.kookrecyp.user.config
 * fileName    : SwaggerConfig
// * author      : jaejun
// * date        : 2024-08-28
// * description :
// * ===================================================
// * DATE             AUTHOR              NOTE
// * ---------------------------------------------------
// * 2024-08-28         jaejun
// */


@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(apiInfo());
    }

    private Info apiInfo() {
        return new Info()
                .title("CodeArena Swagger")
                .description("CodeArena 유저 및 인증 , ps, 알림에 관한 REST API")
                .version("1.0.0");
    }
}


