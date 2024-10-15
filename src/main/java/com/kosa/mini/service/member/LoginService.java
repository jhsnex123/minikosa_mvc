package com.kosa.mini.service.member;

import com.kosa.mini.domain.member.LoginDTO;

public interface LoginService {

    public LoginDTO getUser(String email, String password);
}
