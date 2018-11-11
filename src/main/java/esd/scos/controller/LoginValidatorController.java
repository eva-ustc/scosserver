package esd.scos.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author LRK
 * @project_name scosserver
 * @package_name esd.scos.controller
 * @date 2018/11/4 14:57
 * @description
 *  处理登陆验证
 *  God Bless, No Bug!
 *
 */
@Controller
public class LoginValidatorController {

    @RequestMapping("/login")
    @ResponseBody
    public Map<String, Integer> login(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Map<String,Integer> map = new HashMap<>();
        if (username!=null && "123".equals(password)){

            map.put("RESULTCODE",1);
        }else {
            map.put("RESULTCODE",0);
        }
        return map;
    }
}
