## UserMaintenanceWeb

### Goal
This project is for learning to create a SpringBoot WEB application running in PCF. The frontend will be build in Angular using WebComponents.

### Description
First it requires the user to login over a secure connection. After a valid login the user can add, edit and delete users.

It invokes REST services provided by the UserMaintenanceService deployed in PCF:

- login(name, password)
- addUser(name, email)
- findUserBy(name)
- findUserBy(email)
- getUser(id)
- updateUser(id,name,email)
- deleteUser(id)

### Techniques used
- SpringBoot
- PCF
- Invoking and consuming REST services
- JWT
- Angular
- WebComponents

### Steps

1. Create a Maven project in IntelliJ.
2. Update the pom.xml to contain SpringBoot dependencies for a web project.
3. Create a class with SpringBoot annotation to start the static.
4. Return a basic HTML page.
5. Deploy and configure in PCF.
5. Return static resources.
6. Create a login page to submit a form.
7. Invoke a REST service with the login form data.
8. Create an Angular SPA on the html page.
9. Let Angular invoke the REST service.
10. Invoke UserMaintenanceService in PCF.


#### Step 2
Used Spring Initializr website to create project with:
- web
- Lombok
- Security 
- Dev Tools

#### Step 3
Manually added spring-boot-starter-actuator dependency to the project.

Added main class <code>UserManagementServiceApplication</code> test <code>UserManagementServiceApplicationTest</code>.
Created application.properties and folder static in resources folder.

Added .gitignore file.

Commented Unit tests because they failed.

mvn clean package
java -jar target/UserManagementWeb-0.0.1-SNAPSHOT.jar

In browser http://localhost:8080 returns the greeting text.

