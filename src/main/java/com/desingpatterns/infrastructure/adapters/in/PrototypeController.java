package com.desingpatterns.infrastructure.adapters.in;

import com.desingpatterns.application.IPrinter;
import com.desingpatterns.domains.entities.GenericObject;
import com.desingpatterns.domains.entities.IPrototype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/printer/")
public class PrototypeController {

    @Autowired
    IPrinter printerService;
    @PostMapping("/make-copy")
    @ResponseStatus(HttpStatus.CREATED)
    public ArrayList<IPrototype> getClone(@RequestBody GenericObject request,@RequestParam int quantity){
        return printerService.doCopy(request,quantity);
    }
}
