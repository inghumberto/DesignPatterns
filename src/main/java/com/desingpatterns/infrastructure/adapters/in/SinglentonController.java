package com.desingpatterns.infrastructure.adapters.in;

import com.desingpatterns.application.ISinglentonService;
import com.desingpatterns.domains.patterns.creational.Singlenton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("singlenton")
public class SinglentonController {
    Logger logger= LoggerFactory.getLogger(SinglentonController.class);
    @Autowired
    ISinglentonService singlentonService;
    @GetMapping("/{value}")
    public void getSinglenton(@PathVariable("value") String value){
        singlentonService.getSinglentonInformation(value);
    }

}
