package com.lamrung.example.models;

import java.io.Serializable;

public class AdditionalModel implements Serializable {
    private static final long serialVersionUID = 1L;

    private String param1;
    private String param2;

    public AdditionalModel() {
    }

    public AdditionalModel(String param1, String param2) {
        this.param1 = param1;
        this.param2 = param2;
    }

    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }

    @Override
    public String toString() {
        return "AdditionalModel{" +
                "param1='" + param1 + '\'' +
                ", param2='" + param2 + '\'' +
                '}';
    }
}
