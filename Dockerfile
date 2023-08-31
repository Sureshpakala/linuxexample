FROM eclipse-temurin:17
COPY target/linuxexample.jar linuxexample.jar
CMD ["java","-jar", "linuxexample.jar"]