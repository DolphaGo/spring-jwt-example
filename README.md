# Json Web Token Example

## Goal

* We can use the JWT in Spring.

* And you can easily use this project.

  because basic things in the structure of the project are already prepared.



## Feature

```
├── build.gradle
├── gradlew
├── gradlew.bat
├── settings.gradle
└── src
    ├── main
    │   ├── generated
    │   ├── java
    │   │   └── me
    │   │       └── dolphago
    │   │           ├── Application.java
    │   │           ├── config
    │   │           │   ├── CorsConfig.java
    │   │           │   └── SecurityConfig.java
    │   │           ├── controller
    │   │           │   ├── AuthController.java
    │   │           │   └── UserController.java
    │   │           ├── dto
    │   │           │   ├── LoginDto.java
    │   │           │   ├── TokenDto.java
    │   │           │   └── UserDto.java
    │   │           ├── entity
    │   │           │   ├── Authority.java
    │   │           │   └── User.java
    │   │           ├── jwt
    │   │           │   ├── JwtAccessDeniedHandler.java
    │   │           │   ├── JwtAuthenticationEntryPoint.java
    │   │           │   ├── JwtFilter.java
    │   │           │   ├── JwtSecurityConfig.java
    │   │           │   └── TokenProvider.java
    │   │           ├── repository
    │   │           │   ├── AuthorityRepository.java
    │   │           │   └── UserRepository.java
    │   │           ├── service
    │   │           │   ├── ClientTestService.java
    │   │           │   ├── CustomUserDetailsService.java
    │   │           │   └── UserService.java
    │   │           └── util
    │   │               └── SecurityUtil.java
    │   └── resources
    │       ├── config
    │       │   └── application.yml
    │       └── data.sql
    └── test
        └── java
            └── me
                └── dolphago
                    └── ApplicationTests.java
```



## Version

* Java : 11
* Spring Boot : 2.4.2
* Build Tool : Gradle





#### Issues are always welcome.