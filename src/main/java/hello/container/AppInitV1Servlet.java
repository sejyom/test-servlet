//서블릿 등록 - 프로그래밍 방식
package hello.container;

import hello.servlet.HelloServlet;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletRegistration;

public class AppInitV1Servlet implements AppInit {
    @Override
    public void onStartup(ServletContext servletContext) {
        System.out.println("AppInitV1Servlet.onStartup");

        //순수 서블릿 코드 등록
        ServletRegistration.Dynamic helloServlet =
                servletContext.addServlet("helloServlet", new HelloServlet());
                //2 HelloServlet()에서 get/set 생성하고 서블릿을 서블릿 컨테이너에 직접 등록
        helloServlet.addMapping("/hello-servlet"); //1 이 경로로 들어오면

    }
}
