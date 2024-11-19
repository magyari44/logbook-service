package com.logbook.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
public class DemoApi {


    private static final Logger logger = LoggerFactory.getLogger(DemoApi.class);

    @GetMapping(path = "/**")
    public ResponseEntity<?> get() {
        logger.info("Incoming request!");
        return ResponseEntity.ok("{\"success\":true}");
    }
}
