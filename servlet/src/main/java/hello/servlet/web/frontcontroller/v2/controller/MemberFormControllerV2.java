package hello.servlet.web.frontcontroller.v2.controller;

import hello.servlet.web.frontcontroller.MyView;
import hello.servlet.web.frontcontroller.v2.ControllerV2;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;

public class MemberFormControllerV2 implements ControllerV2 {

  @Override
  public MyView process(ServletRequest request, ServletResponse response)
      throws ServletException, IOException {
    return new MyView("/WEB-INF/views/new-form.jsp");
  }
}
