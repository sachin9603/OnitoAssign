# OnitoAssign

## Language
- Java

## Database
- My-SQL

## Deployment

On terminal perform:
```bash
  Open pom.xml with Spring Tool Suite / IntelliJ IDEA and run
```


application.properties : 
```bash
  #changing the server port
  server.port=8822
  #db specific properties
  spring.datasource.url=jdbc:mysql://localhost:3306/onitoo
  spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
  spring.datasource.username=Enter your My-SQL Username
  spring.datasource.password=Enter your My-SQL Password
  #ORM s/w specific properties
  spring.jpa.hibernate.ddl-auto=update
  spring.jpa.show-sql=true

  spring.mvc.pathmatch.matching-strategy = ANT_PATH_MATCHER

```


## Spring Boot Dependencies
- spring-boot-starter-data-jpa
- spring-boot-starter-validation
- spring-boot-starter-web
- spring-boot-devtools
- mysql-connector-j
- lombok
- springfox-boot-starter
- spring-boot-maven-plugin

## 🛠 Tech Stack

- Java
- Spring
- Spring-boot
- Spring-boot-web
- My-SQL workbench 
- Hibernate


## api to run program with swagger
	#http://localhost:8822/swagger-ui/#/
 <img width="957" alt="image" src="https://github.com/sachin9603/OnitoAssign/assets/103635352/d9b5f574-5225-492c-be61-a137a3daea87">



 
## api to run program with "/api/vi
#http://localhost:8822/api/v1/top-rated-movies

## Thank you note
Thank you all who is giving precious time to visit our little creative project which is made with lot of efforts.

_<p align="center"><sub>- Readme file designed by <a href="https://github.com/sachin9603">Sachin Parmar</a> -</sub></p>_
