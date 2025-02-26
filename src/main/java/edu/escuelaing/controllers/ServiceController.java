package edu.escuelaing.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.time.LocalDate;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://184.72.84.208:8080")
public class ServiceController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hola " + name;
    }

    @GetMapping("/pi")
    public String getPi() {
        return String.valueOf(Math.PI);
    }

    @GetMapping("/euler")
    public String getEuler() {
        return String.valueOf(Math.E);
    }

    @GetMapping("/sum")
    public String sumNumbers(@RequestParam("a") double a, @RequestParam("b") double b) {
        return "Resultado: " + (a + b);
    }

    @GetMapping("/manana")
    public String getTomorrow() {
        return "Mañana será: " + LocalDate.now().plusDays(1);
    }

    @GetMapping("/fecha-hora")
    public String getDateTime() {
        return "Fecha y hora actual: " + LocalDateTime.now();
    }

    @GetMapping("/ip")
    public String getServerIP() {
        try {
            return "IP del servidor: " + InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            return "Error obteniendo la IP";
        }
    }

    @GetMapping("/sistema")
    public String getSystemInfo() {
        return "Sistema operativo: " + System.getProperty("os.name") + " - Versión: " + System.getProperty("os.version");
    }

    @GetMapping("/memoria")
    public String getMemoryInfo() {
        long memoriaUsada = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        return "Memoria usada: " + (memoriaUsada / (1024 * 1024)) + " MB";
    }

    @GetMapping("/autor")
    public String getAuthor() {
        return "Autor: Ricardo";
    }
}
