package com.kosa.mini.service.member;

import com.kosa.mini.domain.member.LoginDTO;
import mybatis.dao.LoginMapper;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{

    private final LoginMapper loginMapper;

    public LoginServiceImpl(LoginMapper loginMapper) {this.loginMapper = loginMapper;}

    @Override
    public LoginDTO getUser(String email, String password) {return loginMapper.getUser(email,password);}
}
