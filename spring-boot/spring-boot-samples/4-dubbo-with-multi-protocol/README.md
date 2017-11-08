基于 Spring Boot 1.5.8.RELEASE 和 Alibaba Dubbo 2.5.7 集成的示例项目

1、使用了 com.gitee.reger 提供的启动器

https://gitee.com/reger/spring-boot-starter-dubbo

    <dependency>
        <groupId>com.gitee.reger</groupId>
        <artifactId>spring-boot-starter-dubbo</artifactId>
        <version>1.0.7</version>
    </dependency>

2、使用注解方式发布和消费服务
3、在业务逻辑层调用 dubbo 服务
4、支持将服务分别使用 dubbo 或 hessian（其他）协议进行发布，也支持将单个服务以 dubbo
或hessian（其他）协议进行发布，注意事项：

a.需要在配置文件中追加协议，如

    spring:
        dubbo:
            protocols:
              - name: hessian
                serialization: hessian2
                port: 20887
                
b.以 dubbo @Service 协议发布服务接口时，指定服务以什么协议发布
        单个协议 @Service(version = "1.0", protocol= "hessian")
        多个协议 @Service(version = "1.0", protocol= {"dubbo","hessian"})
                    
c.使用 hessian 协议需要 servlet 容器支持，为此，Spring Boot 服务提供者需添加依赖

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    
d.需要添加 hessian 依赖

    <!-- https://mvnrepository.com/artifact/com.caucho/hessian -->
    <dependency>
        <groupId>com.caucho</groupId>
        <artifactId>hessian</artifactId>
        <version>4.0.38</version>
    </dependency>
    
e.需要 jetty 依赖支持

    <dependency>
        <groupId>org.mortbay.jetty</groupId>
        <artifactId>jetty</artifactId>
        <version>6.1.26</version>
    </dependency>


