# Workshop3_Workshop on Application Server Architectures, Object Meta-Protocols, IoC Pattern, and Reflection

## Project Summary

The "WebServer" project is a JJava-based Web Server (like Apache) that can serve HTML pages and PNG images. The server must include an IoC framework to create web applications using POJOs and handle multiple non-concurrent requests.

## Architecture
```
WebServer/
├── src/
│   └── main/
│       ├── java/
│       │   └── edu.escuelaing/
│       │       ├── reflexion/
│       │       │   ├── ClassToBeTested
│       │       │   ├── Executor
│       │       │   ├── JUnitECI
│       │       │   ├── Reflexion
│       │       │   └── Test
│       │       └── spring/
│       │           ├── GetMapping
│       │           ├── GreetingController
│       │           ├── HttpServer
│       │           ├── RequestParameters
│       │           ├── RestController
│       │           ├── ServicesAvailable
│       │           ├── Spring
│       │           └── StaticFiles
│       └── resources/
│           ├── index.html
│           ├── script.js
│           └── styles.css


```

## Testing the Server Locally

To use the server locally, follow these steps:

1. Clone the repository into your desired folder:
``` 
git clone https://github.com/RichiVilla/Lab03_AREP-25.git
```

2. Open the cloned folder in your preferred IDE and execute in a GitBash terminal:
```
   mvn clean install
```

4. Run the HttpServer.java file or you can use:

```
   java -cp target/MicroSpring-1.0-SNAPSHOT.jar edu.escuelaing.spring.HttpServer   
```
   
6. Open the following address in your browser:
```
   http://localhost:8080
```

![image](https://github.com/user-attachments/assets/91a857ef-4682-4131-9e87-50b080ae6681)



  
## Testing and Deployment

### Testing the App

Once the server is running, you can use the following endpoints:

- GET /hello?name=<name>: Gives a brief greeting with a name or without it.
- GET /sum?a=<a>&b=<b>: Sums two int numbers.
- GET /pi: Gives the value of Pi.
- GET /euler: Swhows the value of Euler.
- GET /manana: Shows what the next day will be.
- GET /fehca-hora: Gives the exact date and time.
- GET /ip: Gives the IP of the user.
- GET /sistema: Shows the OS of the user.
- GET /memoria: It shows the memory used i the user's pc.
- GET /autor: Gives the name of the person who made the web.

![image](https://github.com/user-attachments/assets/b7cb9ed2-8d41-4591-b14f-e385a37c4f63)


### Checking Requests and Reflection
Running the HttpServer java file, we can check in the CMD if the program is looking for the Request Paths:

1. Memory:

![image](https://github.com/user-attachments/assets/2e02053a-3f6c-4758-b986-0bbe6b1fcc99)

2. Sum:

![image](https://github.com/user-attachments/assets/25e1e2ee-ff80-453c-a356-d73da342c7c4)

3. Manana:

![image](https://github.com/user-attachments/assets/d7eabcb0-1d0e-4e96-a41d-dee3f85fb2fc)



We can check all the services avaliable using the next code:

```
java -cp target/MicroSpring-1.0-SNAPSHOT.jar edu.escuelaing.spring.Spring edu.escuelaing.spring.ServicesAvaliable "http://localhost:8080/<service>"
```

Using the previous line, we can check the services, for example:

1. Hello:
   
![image](https://github.com/user-attachments/assets/8c91cfc2-a101-4897-a6c2-2c6bfc69f688)

2. Fecha-hora

![image](https://github.com/user-attachments/assets/4f99a54b-039d-4029-8acf-e9b99194c75d)

3. Sum:

![image](https://github.com/user-attachments/assets/a7ea0090-8176-4e91-a979-615ed72f3f72)
