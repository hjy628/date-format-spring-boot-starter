package com.hjy.planes.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @auther: hjy
 * @Date: 20-6-4 14:34
 * @Description: 配置信息实体类
 */
@ConfigurationProperties("formatter")
public class DateFormatProperties {

    /**
     * default format pattern
     */
    private String pattern = "yyyy-MM-dd HH:mm:ss";

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
