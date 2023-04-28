FROM eclipse-temurin:20-jre-jammy

COPY consumer/target/classes /app/consumer
COPY provider/target/classes /app/provider
COPY service/target/classes /app/service

ENTRYPOINT ["java", "--module-path", "/app/consumer:/app/provider:/app/service","-m","org.example.consumer/org.example.consumer.Consumer"]