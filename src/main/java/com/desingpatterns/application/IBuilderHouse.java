package com.desingpatterns.application;

import com.desingpatterns.domains.entities.House;
import com.desingpatterns.domains.entities.requests.HouseRequest;

public interface IBuilderHouse {
    public House buildMyOwnHouse(HouseRequest house);
}
