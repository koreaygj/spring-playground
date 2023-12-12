package hello.servlet.web.frontcontroller.v2;

import hello.servlet.web.frontcontroller.MyView;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;

public interface ControllerV2 {

  MyView process(ServletRequest request, ServletResponse response)
      throws ServletException, IOException;

}
