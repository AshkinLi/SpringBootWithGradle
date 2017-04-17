# 利用 Gradle 配置 Spring-Boot

在 Spring-Boot 中，由于用到了嵌入式的 Tomcat，对于 JSP 的支持是有限制的，Spring-Boot 中的嵌入式 Tomcat 并不带有解释 JSP 所用到的相关的类。[官方文档][1]

要使用正常的 JSP 页面，需要进行以下配置：

1. Gradle 中声明 `org.apache.tomcat.embed:tomcat-embed-jasper`
2. 在 `src/resources/application.properties` 文件中声明 JSP 文件的前后缀：

> ```
> spring.mvc.view.prefix: /WEB-INF/views/
> spring.mvc.view.suffix: .jsp
> ```

3. 如果在 JSP 中用到了 JSTL，需要在 Gradle 中声明 `javax.servlet:jstl`

---

[1]:http://docs.spring.io/spring-boot/docs/1.1.x/reference/html/boot-features-developing-web-applications.html#boot-features-jsp-limitations
