package com.desingpatterns.domains;

import com.desingpatterns.application.ISinglenton;
import com.desingpatterns.domains.patterns.creational.Singlenton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SinglentonService implements ISinglenton {
    Logger logger= LoggerFactory.getLogger(SinglentonService.class);
    @Override
    public ArrayList<Singlenton> getSinglentonInformation(String value) {
        if(value==null){value="Barquisimeto";}
        Singlenton onlySin=Singlenton.getInstance(value);
        Singlenton otherSin=Singlenton.getInstance("CARACAS");
        logger.info(onlySin.getValue());
        logger.info(otherSin.getValue());
        ArrayList<Singlenton> singlentonList=new ArrayList<>();
        singlentonList.add(onlySin);
        singlentonList.add(otherSin);
        return singlentonList;
    }
}
