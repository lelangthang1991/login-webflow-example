package com.lamrung.example.services;

import com.lamrung.example.models.LoginBean;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public String validateUser(LoginBean loginBean) {
        String userName = loginBean.getUserName();
        String password = loginBean.getPassword();
        if ("TaoChuAi".equals(userName) && "lamrung".equals(password))
            return "true";
        else return "false";
    }

}
