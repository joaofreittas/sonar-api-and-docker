FROM adoptopenjdk/openjdk11:alpine-slim

ENV TIME_ZONE=America/Sao_Paulo

# Set the timezone in docker
RUN apk --update add tzdata \
&& cp /usr/share/zoneinfo/America/Sao_Paulo /etc/localtime \
&& echo "America/Sao_Paulo" > /etc/timezone \
&& apk del tzdata

WORKDIR /app

COPY . .

COPY target/*.jar /app/app.jar

EXPOSE 8080

CMD java -jar /app/app.jar