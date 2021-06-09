package com.lamrung.example.services;

import com.lamrung.example.models.LoginBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.io.Serializable;

public class LoginService implements Serializable {

    public String validateUser(LoginBean loginBean) {
        String userName = loginBean.getUserName();
        String password = loginBean.getPassword();
        if ("TaoChuAi".equals(userName) && "lamrung".equals(password))
            return "true";
        else return "false";
    }

}
