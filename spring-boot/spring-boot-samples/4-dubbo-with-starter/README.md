基于 Spring Boot 1.5.8.RELEASE 和 Alibaba Dubbo 2.5.7 集成的示例项目

1、使用了 io.dubbo.springboot 提供的启动器

https://github.com/teaey/spring-boot-starter-dubbo

    <dependency>
        <groupId>io.dubbo.springboot</groupId>
        <artifactId>spring-boot-starter-dubbo</artifactId>
        <version>1.0.0</version>
    </dependency

2、使用注解方式发布和消费服务
3、在业务逻辑层调用 dubbo 服务
