package com.example.helloapi;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Tag(name = "Hello", description = "Demo endpoints")
@RestController
public class HelloController {

    @Operation(
            summary = "Returns a hello message",
            description = "Simple demo endpoint returning 'Hello World' in JSON"
    )
    @GetMapping("/hello")
    public Map<String, String> hello() {
        return Map.of("message", "Hello World");
    }
}
