
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM maven
WORKDIR /home/app/
COPY src/ /home/app/src/
COPY pom.xml .
RUN mvn clean package
EXPOSE 8080
ENTRYPOINT ["java","-jar","/home/app/target/spring-0.0.1-SNAPSHOT.jar"]

