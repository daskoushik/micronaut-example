package micronaut.example.javatechie;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hello")
public class HelloController {

    @Get("/message")
    public String message() {
        return "Welcome to Java Micronaut World";
    }
    @Get("/employee")
    public Employee getEmployee() {
        return new Employee(101,"Koushik Das");
    }
}