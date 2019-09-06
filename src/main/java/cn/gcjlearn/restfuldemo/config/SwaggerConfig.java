package cn.gcjlearn.restfuldemo.config;/**
 * @Auther: GongCJ
 * @Introduce:
 * @Date: 2019-09-06
 * @Description: cn.gcjlearn.restfuldemo.config
 * @version: 1.0
 */


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author ：GongCJ
 * @date ：Created in 2019-09-06 22:13
 * @description：
 * @modified By：
 * @version: $
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.build()
				.apiInfo(ApiInfo.DEFAULT);
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("对外开放接口API 文档")
				.description("HTTP对外开放接口")
				.version("1.0.0")
				.termsOfServiceUrl("http://www.gcjlearn.cn:8888")
				.license("LICENSE")
				.licenseUrl("http://www.gcjlearn.cn:8888")
				.build();
	}
}
