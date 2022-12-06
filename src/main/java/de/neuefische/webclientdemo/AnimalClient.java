package de.neuefische.webclientdemo;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class AnimalClient {

    WebClient webClient = WebClient.create("https://eoq2vuf7lltn3qi.m.pipedream.net");

    public Animal getAnimal () {
        Animal animal = webClient.get()
                .uri("/1")
                .retrieve()
                .toEntity(Animal.class)
                .block()
                .getBody();

        return animal;
    }
}
