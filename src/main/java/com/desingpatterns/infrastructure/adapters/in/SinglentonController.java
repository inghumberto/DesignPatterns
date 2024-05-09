package com.desingpatterns.infrastructure.adapters.in;

import com.desingpatterns.application.ISinglenton;
import com.desingpatterns.domains.patterns.creational.Singlenton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@ComponentScan
@RequestMapping("/singlenton")
public class SinglentonController {
    Logger logger= LoggerFactory.getLogger(SinglentonController.class);
    @Autowired
    ISinglenton singlentonService;
    @GetMapping("/{value}")
    @ResponseStatus(HttpStatus.OK)
    public ArrayList<Singlenton> getSinglenton(@PathVariable String value){
        return singlentonService.getSinglentonInformation(value);
    }

}
