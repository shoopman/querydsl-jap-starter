# Introduction

A simple spring boot starter to using QueryDSL for Spring Data JPA.


# Usage


## Introduce to your project

Gradle build.gradle

```gradle
    compile("net.meku.querydsl:querydsl-jpa-starter:1.0-SNAPSHOT")
```

Maven pom.xml 

```xml

	<dependency>
		<groupId>net.meku.querydsl</groupId>
		<artifactId>querydsl-jpa-starter</artifactId>
		<version>1.0-SNAPSHOT</version>
	</dependency>
        
```

## Spring 

Injection

```java
    @Autowired
    JPAQueryFactory queryFactory;


```
