# FF4j DEMO

This application demonstrating capabilities of the `ff4` framework and should be easy to run

To run the app :
```
mvn spring-boot:run
```

The application is now running on `http://localhost:8080`


This sample could also be run as a demo as such it can be deployed as a docker image

```yaml
mvn clean package dockerfile:build
```

Once the image is built you can run it with
```
docker run -p 8080:8080 ff4j/ff4j-demo:1.8.5
```


Cheers.