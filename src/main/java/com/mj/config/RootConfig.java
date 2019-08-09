package com.mj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 根容器 扫描其他非springmvc的类<br>
 *
 */
@Configuration
@ComponentScan(basePackages = "com.mj")
public class RootConfig {

}
