package com.ehaoyao.apigateway.config;/**
 * Created by fei.yao on 2017/12/28.
 */

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.scope.refresh.RefreshScope;

/**
 * @author fei.yao
 * @create 2017-12-28 15:18
 **/
public class ApolloRefreshConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApolloRefreshConfig.class);

    @Autowired
    private RefreshScope refreshScope;

    /*
        inject config for namespace application
     */
    @ApolloConfig
    private Config config;

    @ApolloConfigChangeListener
    public void onChange(ConfigChangeEvent changeEvent) {
        refreshScope.refreshAll();
    }

}
