 #**Taxi Service**
**Taxi-service application** - is an application which can provide basic functionality for creation of taxi service.

**Application provides next opportunities:**
- Authentication service which provide using of application only by registered users;
- Register new driver or Login service if driver exist;
- Register new car manufacturer;
- Register new car;
- Create relations between car and its manufacturer;
- Create relations between cars and their drivers;
- Possibility to see all information about drivers, manufacturers, cars;
- Possibility to delete unnecessary driver, manufacturer, unused car.

**During development were used next design rules:**
- N-tier architecture software design principle: program divided on 3 level: controllers, service, DAO;
- SOLID principles;
- dependency injection through fields injection.

**There are technology which were used:**
- Java 11;
- JDBC;
- Servlet;
- Webserver TOMCAT 9.0.50;
- MySQL 8.0.27;
- JSTL;
- JSP;
- HTML, CSS.

**Required steps before start the application:**
- install IntelliJ IDEA ultimate version;
- install MySQL and MySQL workbench. Collect some data that you need in the next step. Use _resources/init_db.sql_ to create schema at database. Pay attention: if you have schema with name "taxi" it will be replaced; 
- Fulfill URL, USERNAME, PASSWORD, JDBC_DRIVER fields at _java/taxi/util/ConnectionUtil_ class, to make connection to your database.;
- download Tomcat webserver. Recommended v.9.0.50 or close, but not v.10+.
- connect and configure Tomcat inside application;
- download all Maven dependencies at _pom.xml_ file;
- to Logging information about logins, set correct "absolute path" on the line _File name="LogToFile" fileName="absolute path"_ to the file where to save logs at _src/main/resources/log4j2.xml_ file.
