package com.example.demo.service;

import com.example.demo.controller.request.LoginRequest;
import com.example.demo.data.FakeData;
import com.example.demo.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class LoginService {


  public User login(LoginRequest request) throws Exception {
    User user = FakeData.initUser();
    if (request.getUsername().equals(user.getUsername()) && request.getPassword().equals(user.getPassword())) {
      return new User(request.getUsername(), request.getPassword());
    } else {
      throw new Exception("login false");
    }
  }
}
