package cn.gcjlearn.restfuldemo.config;/**
 * @Auther: GongCJ
 * @Introduce:
 * @Date: 2019-09-06
 * @Description: cn.gcjlearn.restfuldemo.config
 * @version: 1.0
 */


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author ：GongCJ
 * @date ：Created in 2019-09-06 22:26
 * @description：
 * @modified By：
 * @version: $
 */

@Configuration
@EnableWebMvc
public class WebAppConfig implements WebMvcConfigurer {
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	}
}
