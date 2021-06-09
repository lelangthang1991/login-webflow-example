package com.lamrung.example.services;

import com.lamrung.example.models.AdditionalModel;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class AdditionalService implements Serializable {

    public String showDefaultModel(AdditionalModel additionalModel) {
        if (additionalModel == null || additionalModel.getParam1() == null || additionalModel.getParam2() == null) {
            return "false";
        }
        return "true";
    }

}
