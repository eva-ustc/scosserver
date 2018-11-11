package esd.scos.controller;

import esd.scos.fooddb.Database_food;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author LRK
 * @project_name scosserver
 * @package_name esd.scos.controller
 * @date 2018/11/4 15:17
 * @description God Bless, No Bug!
 */
@Controller
public class FoodUpdateServiceController {

    @ResponseBody
    @RequestMapping(value = "/updateXMLFood",produces = {"application/xml; charset=UTF-8"})
    public Map<String,Object> updateXMLFood(){
        return getAddFoodMap();
    }

    @ResponseBody
    @RequestMapping("/updateJSONFood")
    public Map<String,Object> updateJSONFood(){
        return getAddFoodMap();
    }

    private Map<String, Object> getAddFoodMap() {
        Map<String,Object> add_food = new HashMap<>(); // 新加菜品

//      add_food.put("image", R.mipmap.ic_xilianghecuyu);
        add_food.put("foodName","西凉河醋鱼");
        add_food.put("foodPrice", 69.5f);
        add_food.put("foodStock",10);
        add_food.put("foodType",1);
        return add_food;
    }
}
