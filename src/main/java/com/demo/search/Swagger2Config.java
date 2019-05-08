package com.demo.search;

import io.swagger.annotations.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * 2 * @Author: daidai
 * 3 * @Date: 2019/5/8 10:45
 * 4
 */
@Configuration
public class Swagger2Config {
    @Bean
    Docket decket(){
        return  new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.demo.search.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(new ApiInfoBuilder().title("milu的api文档")
                        .description("这是我的文档信息").version("v1.0")
                        .contact("milu")
                        .build());


    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger2")
                .description("www.baidu.com")
                .termsOfServiceUrl("http://www.baidu.com")
                .contact("milu")
                .version("1.0")
                .build();
    }


}
