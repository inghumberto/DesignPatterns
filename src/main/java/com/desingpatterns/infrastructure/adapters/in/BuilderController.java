package com.desingpatterns.infrastructure.adapters.in;

import com.desingpatterns.application.IBuilderHouse;
import com.desingpatterns.domains.entities.House;
import com.desingpatterns.domains.entities.requests.HouseRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/builder")
public class BuilderController {
    @Autowired
    IBuilderHouse builderHouse;

    @PostMapping("/make-house")
    @ResponseStatus(HttpStatus.CREATED)
    public House buildHouse(@RequestBody HouseRequest house){
        return builderHouse.buildMyOwnHouse(house);
    }
}
