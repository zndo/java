这是一个 Spring Boot 类型的 Java Web 应用，可打包为一个独立运行的 Jar 文件。

当项目依赖中包含 spring-boot-starter-web 时，Spring Boot 项目将自动启用默认的 Web 
配置，通过查看其内容可知：内置的 tomcat 是其默认的 Web 容器。我们也可以很方便地采用
其他 Web 容器

如果未在配置文件中提供 Web 容器的配置信息，项目针对内置 tomcat 容器打开 8080 端口，
未提供对于根目录访问的请求映射控制器时，访问 http://localhost:8080 会 显示错误：
Whitelabel Error Page