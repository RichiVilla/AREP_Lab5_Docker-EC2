# Workshop4: Modularization with Virtualization and Introduction to Docker

## Project Summary

This project involves building a web application, containerizing it with Docker, and deploying it on an AWS EC2 instance for efficient and scalable hosting.

## Architecture
```
Lab03_AREP_25-1/
├── src/
│   └── main/
│       ├── java/
│       │   └── edu.escuelating/
│       │       ├── controllers/
│       │       │   ├── ServiceController
│       │       │   └── CorsConfig
│       │       └── SpringBootApp
│       └── resources/
│           ├── static/
│           │   ├── index.html
│           │   ├── script.js
│           │   └── styles.css
│           └── application.properties
├── target/
├── Dockerfile
├── pom.xml
└── README.md
```

## System Architecture Overview

This is a web-based system with a microservice architecture, consisting of the following components:

#### 1. Frontend (UI):
   
- Technology: HTML, CSS, JavaScript, React (with React Bootstrap for UI components).
  
- Description: The user interface runs in the client's browser (PC, mobile, etc.). It interacts with the backend APIs via HTTP requests (using fetch or axios). The frontend includes forms and buttons for user input, such as greeting the user or summing numbers.

#### 2. Backend (Server and REST APIs):

- Technology: Spring Boot (Java), providing RESTful APIs.
- Description: The backend handles incoming HTTP requests and processes the business logic, returning responses in text or JSON format.
- Endpoints: /hello, /sum, /pi, /euler, /manana (tomorrow), /fecha-hora (current time), /ip, /sistema (system info), /memoria (memory info), /autor.



  
## Getting Started

These instructions will help you set up the project on your local machine for development and testing purposes.


##### Installing

1. Clone the repository:

```
git clone https://github.com/RichiVilla/AREP_Lab5_Docker-EC2.git
```

2. Navigate to the project directory:

```
cd AREP_Lab5_Docker-EC2
```

3. Build and run the backend:

```
mvn spring-boot:run
```

4. Access the application at
   
```
http://localhost:8080
```


#### Deployment
1. Create an EC2 instance (with access to port 8080 from anywhere) and obtain the Public IP value.
2. In the project, modify `application.properties`, `script.js`, and `ServiceController.java` to replace the IP with the one obtained from EC2:
   `http://[YOUR_IP]:8080`
3. On Docker Hub, create a new repository.
4. Build the `.jar` file of the project by running:
   `mvn clean install`
5. Run the following commands to upload the image to Docker Hub:
```
docker build -t [YOUR_USERNAME]/[REPOSITORY_NAME]
```
```
docker push [YOUR_USERNAME]/[REPOSITORY_NAME]
```
6. Connect to the EC2 console and execute the following commands:

```
docker pull [YOUR_USERNAME]/[REPOSITORY_NAME]
```
```
docker run -d -p 8080:8080 [YOUR_USERNAME]/[REPOSITORY_NAME]
```
7. Check if the application is running by executing:
`docker ps`
8. Finally, open the page to verify the application is working:
`http://[PUBLIC_IP]:8080`

## Architecture Diagram

            +-------------------+
            |   Client (Browser) |
            +-------------------+
                    |
                    v
         +---------------------------+
         |    AWS EC2 Instance        |
         |  (Web Server + Docker)     |
         +---------------------------+
                    |
                    v
         +---------------------------+
         |    Docker Container       |
         |  (App/Service from Docker)|
         +---------------------------+
                    |
                    v
         +---------------------------+
         |       Docker Hub          |
         |    (Docker Images)        |
         +---------------------------+


## Video

- Testing the service with EC2 & Docker


https://github.com/user-attachments/assets/589689a7-fb39-441a-8fc4-05bcbb801506


- Testing with the URLs


https://github.com/user-attachments/assets/793dfc3f-4632-4840-a740-7af028524829


## Authors

Ricardo Villamizar
