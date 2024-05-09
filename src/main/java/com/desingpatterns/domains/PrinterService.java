package com.desingpatterns.domains;

import com.desingpatterns.application.IPrinter;
import com.desingpatterns.domains.entities.GenericObject;
import com.desingpatterns.domains.entities.IPrototype;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class PrinterService implements IPrinter {
    Logger logger= LoggerFactory.getLogger(PrinterService.class);
    @Override
    public ArrayList<IPrototype> doCopy(IPrototype sourceObject,int quantity) {
        ArrayList<IPrototype> copies=new ArrayList<>();
        copies.add(sourceObject);
        for (int i=0;i<quantity;i++) {
            copies.add(sourceObject.clone());
        }
        return copies;
    }
}
