package com.citigroup.hendui.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @auther Shawn
 * @create 2020-02-21 11:42
 */
@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("path_route_guonei",
                r -> r.path("/guonei")
                        .uri("http://news.baidu.com/guonei"))
                .route("path_route_guoji",
                        r -> r.path("/guoji")
                                .uri("http://news.baidu.com/guoji")).build();

        return routes.build();
    }
}
