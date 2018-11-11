package esd.scos.servlet;

import org.springframework.boot.web.servlet.ServletRegistrationBean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author LRK
 * @project_name scosserver
 * @package_name esd.scos.servlet
 * @date 2018/11/4 14:46
 * @description God Bless, No Bug!
 */
public class LoginValidatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        doPost(req,resp);
    }

    /**
     * 处理客户端登录请求
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 验证传入的username和password是否符合规则

    }
}
