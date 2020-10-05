package com.thc.servicebase;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author thc
 * @Title:
 * @Package com.thc.servicebase
 * @Description:
 * @date 2020/8/11 4:50 下午
 */
@Configuration
@EnableSwagger2 // swagger
public class SwaggerConfig {


    @Bean
    public Docket webApiConfig(){

        // 参数配置
        List<Parameter> parameters = new ArrayList<>();
        parameters.add(new ParameterBuilder()
                .name("JWTHeaderName")
                .description("认证token")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .required(false)
                .build());
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("webApi")
                .apiInfo(webApiInfo())
                .globalOperationParameters(parameters)
                .select()
                // 接口路径中包含admin和error时不显示，不写就都会显示
                // .paths(Predicates.not(PathSelectors.regex("/admin/.*")))
                .paths(Predicates.not(PathSelectors.regex("/error.*")))
                .build();

    }

    /**
     * 文档信息
     * @return
     */
    private ApiInfo webApiInfo(){

        return new ApiInfoBuilder()
                .title("网站-thc-auth")
                .description("本文档描述了课程中心微服务接口定义")
                .version("1.0")
                .contact(new Contact("thc", "http://thc.com", "120698463@qq.com"))
                .build();
    }
}
