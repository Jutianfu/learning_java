package org.example.learning_springboot.demos.web.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaagerConfig {
    @Bean
    /**
     * 创建并配置一个OpenAPI实例，用于描述春季商店的API文档
     *
     * 此方法详细定义了API文档的元数据，包括文档标题、描述、版本号、许可证信息以及外部文档链接
     * 它使用OpenAPI规范来构建，旨在为API的消费者提供清晰、结构化的API使用说明和示例
     *
     * @return OpenAPI 配置好信息和外部文档链接的OpenAPI实例
     */
    public OpenAPI springShopOpenAPI(){
        return new OpenAPI()
                .info(new Info().title("标题")
                        .contact(new Contact())
                        .description("我的文档")
                        .version("1.0.0")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("外部文档")
                        .url("https://springshop.wiki.github.org.docs"));
    }
    }
}
