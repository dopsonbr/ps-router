package com.dopsonbr.psrouter

import io.prometheus.client.spring.boot.EnablePrometheusEndpoint
import io.prometheus.client.spring.boot.EnableSpringBootMetricsCollector
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.zuul.EnableZuulProxy
import org.springframework.context.annotation.Bean

@EnablePrometheusEndpoint
@EnableSpringBootMetricsCollector
@EnableZuulProxy
@SpringBootApplication
class PsRouterApplication

fun main(args: Array<String>) {
    SpringApplication.run(PsRouterApplication::class.java, *args)

    @Bean
    fun simpleFilter() = SimpleFilter()
}