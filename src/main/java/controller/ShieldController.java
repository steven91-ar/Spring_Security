package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShieldController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String avengersAssemble() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public String secretBases() {
        return "Liste des villes où il y a une Wild Code School";
    }
}