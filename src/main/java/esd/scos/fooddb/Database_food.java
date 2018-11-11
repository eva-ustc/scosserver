package esd.scos.fooddb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author LRK
 * @project_name SCOS
 * @package_name es.source.code.scos.model
 * @date 2018/10/6 22:12
 * @description
 */

public class Database_food {

    public static final  String[] coldFoodNames = new String[]{"凉拌黄瓜","卤水牛肉","酱萝卜","鲜奶木瓜冻"};
    public static final  Float[] coldFoodPrices = new Float[]{25.0f,39.0f,18.0f,22.0f};

    public static final  String[] hotFoodNames = new String[]{"西红柿炒蛋","爆炒猪肝","荷香粉蒸肉","铁板羊肉"};
//    public static final  String[] hotFoodPrices = new String[]{"15元","23元","21元","35元"};
    public static final  Float[] hotFoodPrices = new Float[]{15.0f,23.0f,21f,35f};

    public static final  String[] seaFoodNames = new String[]{"辣炒花蛤","清蒸花蟹","清蒸鲈鱼","油焖大虾"};
    public static final  Float[] seaFoodPrices = new Float[]{36f,37f,31f,35f};

    public static final  String[] beverageNames = new String[]{"7喜","纯生啤酒","可口可乐","雪碧"};
//    public static final  String[] beveragePrices = new String[]{"3.5元","4元","3.5元","3.5元"};
    public static final  Float[] beveragePrices = new Float[]{3.5f,4f,3.5f,3.5f};

    public static List<Map<String,Object>> foodDatabase = new ArrayList<>();
    // 初始化food数据库库存信息
    static {
        // foodType 0--coldfood 1--hotfood 2--seafood 3--beverage
        for(int i =0;i< Database_food.coldFoodNames.length;i++){
            Map<String,Object> map = new HashMap<>();
            map.put("foodName",Database_food.coldFoodNames[i]);
            map.put("foodPrice", Database_food.coldFoodPrices[i]);
            map.put("foodType",0);
            map.put("foodStock",10); // 添加库存信息
            foodDatabase.add(map);
        }
        for(int i =0;i<Database_food.hotFoodNames.length;i++){
            Map<String,Object> map = new HashMap<>();
            map.put("foodName",Database_food.hotFoodNames[i]);
            map.put("foodPrice", Database_food.hotFoodPrices[i]);
            map.put("foodType",1);
            map.put("foodStock",10); // 添加库存信息
            foodDatabase.add(map);
        }
        for(int i =0;i<Database_food.seaFoodNames.length;i++){
            Map<String,Object> map = new HashMap<>();
            map.put("foodName",Database_food.seaFoodNames[i]);
            map.put("foodPrice", Database_food.seaFoodPrices[i]);
            map.put("foodType",2);
            map.put("foodStock",10); // 添加库存信息
            foodDatabase.add(map);
        }
        for(int i =0;i<Database_food.beverageNames.length;i++){
            Map<String,Object> map = new HashMap<>();
            map.put("foodName",Database_food.beverageNames[i]);
            map.put("foodPrice", Database_food.beveragePrices[i]);
            map.put("foodType",3);
            map.put("foodStock",10); // 添加库存信息
            foodDatabase.add(map);
        }
    }
}
