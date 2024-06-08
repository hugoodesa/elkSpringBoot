package br.com.learn.elasticSearch.controller;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logger")
public class MyLoggerController {

    private static final Logger LOG = LogManager.getLogger(MyLoggerController.class);

    @GetMapping("/echo/{message}")
    public ResponseEntity<String> echoMessage(@PathVariable String message) {
        LOG.log(Level.INFO, "=====* Message from LOG! *=====");
        LOG.log(Level.INFO, "Recieved message " + message);
        return ResponseEntity.ok("Works !");
    }


}
