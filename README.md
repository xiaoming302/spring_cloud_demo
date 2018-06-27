# spring_cloud_demo
spring cloud demo

## 软件
+ 1、macOS High Sierra 10.X
+ 2、IntelliJ IDEA 2018.1
+ 3、Docker 18.03.1-ce
+ 4、HBuilder 9.0.8.201806081953
+ 5、maven 3.3.9
+ 6、MySQL 5.7.19

## 框架及使用的jar包（maven依赖）
#### 一、Spring 系列框架
##### 1、spring boot 2.0.3
+ 1.1 spring-boot-starter-web
+ 1.2 spring-boot-starter-test
+ 1.3 spring-boot-configuration-processor
+ 1.4 spring-boot-starter-actuator
+ 1.5 spring-boot-starter-data-jpa

##### 2、spring cloud Finchley.RELEASE
+ 2.1 spring-cloud-starter-netflix-eureka-server
+ 2.2 spring-cloud-starter-netflix-eureka-client
+ 2.3 spring-cloud-config-server
+ 2.4 spring-cloud-starter-config
+ 2.5 spring-cloud-starter-openfeign
+ 2.6 spring-cloud-starter-netflix-hystrix

##### 3、其他
+ 3.1 spring-restdocs-mockmvc

#### 二、maven插件
+ 1 spring-boot-maven-plugin
+ 2 maven-surefire-plugin
+ 3 asciidoctor-maven-plugin
+ 4 feign-httpclient

#### 三、其他
+ 1 fastjson（1.2.38）
+ 2 commons-codec
+ 3 druid（1.1.4）
+ 4 mysql-connector-java
+ 5 springfox-swagger2（2.8.0）
+ 6 springfox-swagger-ui（2.8.0）
+ 7 springfox-staticdocs（2.6.1）

## 应用说明
### server-X 组件服务
本项目所有服务组件均以server开头来命名
#### 1、server-eureka 统一服务管理服务
服务注册中心，目前未实现高可用架构。

#### 2、server-config 统一配置管理服务
服务配置管理中心，已实现高可用。
读取配置使用application名称作为searchPaths，使用yml语言时需要使用单引号将application包裹（'{application}'）

### app-server-X 应用服务
本项目所有应用服务均以app-server开头来命名
#### app-server-user 统一用户管理中心
+ 集成内容<br/>
集成了eureka、config client、swagger2，并可将API生成HTML文件
+ 应用部分<br/>
暂时没有开始

### app-X-web web应用
本项目所有PC应用均以app-X-web格式命名
#### app-console-web 应用管理控制台
+ 集成内容<br/>
集成了eureka、config client、feign、Hystrix
+ 应用部分<br/>
暂时没有开始

### app-X-mobile 移动应用
本项目所有移动应用均以app-X-mobile格式命名

