FROM openjdk:8
MAINTAINER bill@billbensing.com
EXPOSE 3003
ADD /target/wb3-edgeserver.jar wb3-edgeserver.jar
ENTRYPOINT ["java", "-jar", "wb3-edgeserver.jar"]