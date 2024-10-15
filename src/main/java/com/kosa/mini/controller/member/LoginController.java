package com.kosa.mini.controller.member;

import com.kosa.mini.domain.member.LoginDTO;
import mybatis.dao.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    private final LoginMapper loginMapper;  // 필드 선언

    @Autowired
    public LoginController(LoginMapper loginMapper) {  // 생성자 주입
        this.loginMapper = loginMapper;
    }

    // 로그인 처리
    @PostMapping("/login")
    public ResponseEntity<String> login(LoginDTO loginDTO) {
        LoginDTO user = loginMapper.getUser(loginDTO.getEmail(), loginDTO.getPassword());
        System.out.println("============================= "+loginDTO.getEmail());

        if (user != null) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }
}
