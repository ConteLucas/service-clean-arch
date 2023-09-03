FROM openjdk:11-jre-slim

WORKDIR /app

COPY ./src /app

CMD ["java", "Main"]
