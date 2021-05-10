package com.pactera.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author James
 * @date 2021/4/27
 * @decription
 */
@Data
@Component
@ConfigurationProperties(prefix = "myredis")
@NoArgsConstructor
public class SystermParam {
	public String name;
}
