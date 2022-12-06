package de.neuefische.webclientdemo;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

public class Webclient {
    WebClient webClient2 = WebClient.create("https://eokz7vcsigzeiih.m.pipedream.net");

   public Aufgabe2 message(){

       Aufgabe2 message = webClient2.post()
               .uri(" A ")
               .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
               .bodyValue(List.of(2,2,2,1))
               .retrieve()
               .toEntity(Aufgabe2.class)
               .block()
               .getBody();

       return message;
   }


}
