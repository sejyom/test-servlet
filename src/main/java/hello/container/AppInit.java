//애플리케이션 초기화
package hello.container;

import jakarta.servlet.ServletContext;

public interface AppInit {
    default void onStartup(ServletContext servletContext) {

    }
}
