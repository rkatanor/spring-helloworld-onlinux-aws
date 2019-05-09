FROM openjdk:8
ADD target/myjar-0.1.jar myjar.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","myjar.jar"]