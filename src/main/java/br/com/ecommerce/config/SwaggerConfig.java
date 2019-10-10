package br.com.ecommerce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Class responsible for configuring Swagger settings.
 *
 * @version 1.0
 * @since 08.10.2019
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

  @Bean
  public Docket apit() {
    return new Docket(DocumentationType.SWAGGER_2).select()
        .apis(RequestHandlerSelectors.basePackage("br.com.ecommerce"))
        .paths(PathSelectors.any())
        .build()
        .apiInfo(this.apiInfo());
  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
        .title("Ecommerce Backend")
        .description("Backend Spring Boot to Ecommerce")
        .version("1.0")
        .build();
  }
}