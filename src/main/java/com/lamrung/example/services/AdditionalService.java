package com.lamrung.example.services;

import com.lamrung.example.models.AdditionalModel;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.Serializable;

@Service
public class AdditionalService implements Serializable {

    public String showDefaultModel(AdditionalModel additionalModel) {
        if (additionalModel == null ||
                StringUtils.isEmpty( additionalModel.getParam1()) ||
                StringUtils.isEmpty(additionalModel.getParam2())) {
            return "false";
        }
        return "true";
    }

}
