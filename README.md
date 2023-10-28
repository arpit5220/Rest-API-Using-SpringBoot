# Book Store Rest-API-Using-SpringBoot

## Functionalities
- User can get Books
- Get book by Id
- Add Books
- Update Book
- Delete Book
  
## Tech Stacks
- Java
- SpringBoot
- Rest API
- Hibernate Jpa
- Mysql
- Tomcat 
- Maven 

## Installation and Run
- You can clone this repo and start the serve on localhost
- Before running the API server, we should update the database config inside the application.properties file.
- Update the port number, username and password as per our local database config.
````
server.port=9091

spring.datasource.name=d1
spring.datasource.url=jdbc:mysql://localhost:3306/book_db
spring.datasource.username=root
spring.datasource.password=root123
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update

## Hibernate Properties
# The SQL dialect makes Hibernate generate better SQL for the chosen database
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL8Dialect

````


## API Testing using PostMan

![Screenshot (1034)](https://github.com/arpit5220/Rest-API-Using-SpringBoot/assets/94009815/cacc5818-8bec-46d3-90d8-52748fe7817d)
