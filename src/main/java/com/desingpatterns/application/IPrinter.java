package com.desingpatterns.application;

import com.desingpatterns.domains.entities.IPrototype;

import java.util.ArrayList;

public interface IPrinter {
    public ArrayList<IPrototype> doCopy(IPrototype sourceObject,int quantity);
}
