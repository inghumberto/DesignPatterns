package com.desingpatterns.domains;

import com.desingpatterns.application.IBuilderHouse;
import com.desingpatterns.domains.entities.House;
import com.desingpatterns.domains.entities.requests.HouseRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BobBuiderService implements IBuilderHouse {
    Logger logger= LoggerFactory.getLogger(BobBuiderService.class);
    @Override
    public House buildMyOwnHouse(HouseRequest house) {
        House.BuilderHouse related= new House.BuilderHouse().address(house.getAddress());
        if(house.getHasAttic()!=null)related.hasAttic(house.getHasAttic());
        if(house.getHasBasement()!=null)related.hasBasement(house.getHasBasement());
        if(house.getHasFireplace()!=null)related.hasFireplace(house.getHasFireplace());
        if(house.getHasSolarPanels()!=null)related.hasSolarPanels(house.getHasSolarPanels());
        if(house.getHasGarden()!=null)related.hasGarden(house.getHasGarden());
        if(house.getHasGarage()!=null)related.hasGarage(house.getHasGarage());
        if(house.getHasSwimmingPool()!=null)related.hasGarden(house.getHasSwimmingPool());
        if(house.getAddress()!=null)related.address(house.getAddress());
        if(house.getBathrooms()!=null)related.bedrooms(house.getBedrooms());
        if(house.getBathrooms()!=null)related.bathrooms(house.getBathrooms());
        House houseMaked=related.build();
        logger.info("Information Building House"+houseMaked.toString());
        return houseMaked;
    }
}
