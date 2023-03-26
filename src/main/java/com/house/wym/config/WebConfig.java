package com.house.wym.config;

import com.house.wym.system.SystemUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        //映射图片保存地址
        if(SystemUtils.isWindows()){
            registry.addResourceHandler("/images/**").addResourceLocations("file:D:/file/");
        }else{
            registry.addResourceHandler("/imgs/**").addResourceLocations("file:/Users/wujiantao/Documents/imgs/");
        }
    }
}
