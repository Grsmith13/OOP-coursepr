package edu.tntech.csc2310.fa2021;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoursePRGraph {

    private static final String template = "yourid %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/prerequisites")
    public CoursePR prerequisites(@RequestParam(value = "prefix", defaultValue = "CSC") String param) {
        return new CoursePR(counter.incrementAndGet(), String.format(template, param));
    }
}
