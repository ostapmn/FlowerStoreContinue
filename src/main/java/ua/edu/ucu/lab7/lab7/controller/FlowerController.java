package ua.edu.ucu.lab7.lab7.controller;


import ua.edu.ucu.lab7.lab7.store.Flower;
import ua.edu.ucu.lab7.lab7.store.FlowerColor;
import ua.edu.ucu.lab7.lab7.store.FlowerType;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowerController {

    @GetMapping("/flowers")
    public List<Flower> getFlowers() {
        return List.of(new Flower(10.0, FlowerColor.RED, 40, FlowerType.ROSE));
    }
}
