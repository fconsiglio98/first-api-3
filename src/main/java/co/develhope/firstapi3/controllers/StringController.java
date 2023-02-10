package co.develhope.firstapi3.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/strings")
public class StringController {

    @GetMapping
    public String getStrings(@RequestParam String string1, @RequestParam(required = false) String string2){
        if (string2 != null) {
            return string1 + " " + string2;
        } else {
            return string1;
        }
    }
}