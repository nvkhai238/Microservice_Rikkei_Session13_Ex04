package com.rikkei.identity;

import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductDemoController {
    @GetMapping("/api/products")
    public List<Map<String, Object>> products() {
        return List.of(Map.of("id", 1, "name", "Laptop demo"));
    }
}
