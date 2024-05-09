package com.desingpatterns.domains.patterns.creational;

public final class Singlenton {
    private static Singlenton instance;
    private String value;

    private Singlenton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.value = value;
    }

    public static Singlenton getInstance(String value){
        if (instance==null){
            instance= new Singlenton(value);
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
