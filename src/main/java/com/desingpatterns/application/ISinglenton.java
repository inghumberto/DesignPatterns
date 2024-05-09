package com.desingpatterns.application;

import com.desingpatterns.domains.patterns.creational.Singlenton;

import java.util.ArrayList;

public interface ISinglenton {
    public ArrayList<Singlenton> getSinglentonInformation(String value);
}
