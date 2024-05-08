package com.desingpatterns.domains.patterns.creational;

public final class Singlenton {
    private static Singlenton instance;
    private String value;

    private Singlenton(String value) {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.value = value;
    }

    public Singlenton getInstance(String value){
        if (instance==null){
            new Singlenton(value);
        }
        return instance;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
