FROM openjdk:8
MAINTAINER bill@billbensing.com
EXPOSE 8080
ADD /target/wb3-edgeserver.jar wb3-edgeserver
ENTRYPOINT ["java", "-jar", "wb3-edgeserver.jar"]