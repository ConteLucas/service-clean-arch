# Use a imagem base do OpenJDK 11
FROM openjdk:11-jre-slim

# Defina um diretório de trabalho no contêiner
WORKDIR /app

# Copie o arquivo JAR da aplicação para o diretório de trabalho no contêiner
COPY target/service-integration-dev.jar /app/

# Especifique o comando para iniciar a aplicação quando o contêiner for iniciado
CMD ["java", "-jar", "service-integration-dev.jar"]
