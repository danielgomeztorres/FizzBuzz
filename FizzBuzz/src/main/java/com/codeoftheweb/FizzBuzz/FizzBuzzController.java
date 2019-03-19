package com.codeoftheweb.FizzBuzz;



import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class FizzBuzzController {


    @RequestMapping(path = "/fizzBuzz", method = RequestMethod.POST)
    public Map<String, Object> fizzBuzzDTO(@RequestParam ("number") Integer number) {
        Map<String, Object> dto = new LinkedHashMap<>();

    try {

    for (int i = number; i <= (number + 100); i++) {

        if (i % 15 == 0) {
            System.out.println("FizzBuzz");
        } else if (i % 3 == 0) {
            System.out.println("Fizz");
        } else if (i % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
    }
    return dto;
    } catch (NumberFormatException exception){
     dto.put("msg", "No is a number");
    return dto;
    }
    }
}
