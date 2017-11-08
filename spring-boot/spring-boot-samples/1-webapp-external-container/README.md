Spring Boot 支持多种类型的 Web 容器，默认的内置容器为 tomcat

当然同时也支持如：Undertow、Jetty，只需从项目依赖 spring-boot-starter-web 中排除
tomcat，并添加其他容器的依赖，对容器进行配置