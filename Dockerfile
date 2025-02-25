FROM eclipse-temurin:21
LABEL maintainer="Doars"
WORKDIR /aplicacao
COPY target/Doars-0.0.1-SNAPSHOT.jar /aplicacao/servicos-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/aplicacao/servicos-0.0.1-SNAPSHOT.jar"]