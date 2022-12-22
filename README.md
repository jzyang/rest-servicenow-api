# Run Project

Build:
Go into the project directory:
```cd rest-servicenow-api```

Build the project:

```./gradlew build```

Run the project:

```./gradlew bootRun```

In `src/main/resources/application.properties` port is set to 8082:

```server.port=8082```

The browser-plugin is set to communicate to this project on:
```localhost:8082/```

REST paths:
```
    /serviceNow/user
    /serviceNow/incident
```
