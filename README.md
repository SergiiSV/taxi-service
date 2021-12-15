# Taxi Service
It's an application that can provide basic functionality for the creation of taxi service.

## Application provides next opportunities:
- Register
- Login
- Add new manufacturer and car
- See all information about drivers, manufacturers, cars
- Delete unnecessary driver, manufacturer, car

## During development were used next design rules:
- N-tier architecture software design principle: program divided into 3 levels: controllers, service, DAO
- SOLID principles
- Dependency injection

## There are technologies that were used:
- Java 11
- JDBC
- Servlet
- Tomcat 9.0.50
- MySQL 8.0.27
- JSTL
- JSP
- HTML, CSS

## Required steps before starting the application:
1. install IntelliJ IDEA ultimate version;
2. install MySQL and MySQL workbench. Collect some data that you need in the next step. Use _resources/init_db.sql_ to create schema at database. Pay attention: if you have a schema with the name "taxi" it will be replaced;
3. Fulfill URL, USERNAME, PASSWORD, JDBC_DRIVER fields at _java/taxi/util/ConnectionUtil_ class, to make the connection to your database;
4. Download Tomcat webserver. Recommended v.9.0.50 or close, but not v.10+.
5. Connect and configure Tomcat inside the application;
6. to Logging information about logins, set correct "absolute path" on the line _File name="LogToFile" fileName="absolute path"_ to the file where to save logs at _src/main/resources/log4j2.xml_ file.
