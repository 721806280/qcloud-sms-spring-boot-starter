# qcloud-sms-spring-boot-starter

基于 `Spring Boot` 框架，快速集成【腾讯云】【短信】服务

## 快速集成

1. 在 `pom.xml` 文件中引入依赖
    ```xml
    <dependency>
        <groupId>com.qcloud.sme</groupId>
        <artifactId>qcloud-sms-spring-boot-starter</artifactId>
        <version>1.0.0</version>
    </dependency>
    ```
2. 在 `application.yml` 文件中，进行配置
    ```yaml
    qcloud:
      sms:
        region: ap-beijing
        app-id: 14******50
        app-key: e36fefdf3dedbe46******8e346d3a23
        secret-id: AKIDyKOEbiUAWS******k4AzYr2NbZLwYLCs
        secret-key: omUxiCLHnLiqm******MaYJp66wkM2aF
    ```

## 快速开发

1. 在 `Spring Boot` 项目中，可以直接注入 `QcloudSms` 接口
    ```java
    @Resource
    private QcloudSms qcloudSms;
    ```
2. 使用 `QcloudSms` 接口中的方法