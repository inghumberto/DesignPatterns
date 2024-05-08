package com.desingpatterns.domains;

import com.desingpatterns.application.ISinglentonService;
import com.desingpatterns.domains.patterns.creational.Singlenton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SinglentonService implements ISinglentonService {
    Logger logger= LoggerFactory.getLogger(SinglentonService.class);
    private Singlenton singlenton;
    @Override
    public void getSinglentonInformation(String value) {
        Singlenton onlySin=singlenton.getInstance(value);
        Singlenton otherSin=singlenton.getInstance("CARACAS");
        logger.info(onlySin.getValue());
        logger.info(otherSin.getValue());
    }
}
