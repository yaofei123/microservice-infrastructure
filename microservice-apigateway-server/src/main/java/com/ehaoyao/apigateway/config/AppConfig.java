package com.ehaoyao.apigateway.config;/**
 * Created by fei.yao on 2017/12/28.
 */

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author fei.yao
 * @create 2017-12-28 15:51
 **/
@Configuration
@EnableApolloConfig
public class AppConfig {
    @Bean
    public ApolloRefreshConfig testApolloAnnotationBean() {
        return new ApolloRefreshConfig();
    }
}
