package hello.servlet.web.frontcontroller.v1;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.io.IOException;

public interface ControllerV1 {

  void process(ServletRequest request, ServletResponse response)
      throws ServletException, IOException;
}
