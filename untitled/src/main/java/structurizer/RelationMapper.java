package structurizer;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by i on 31.07.2014.
 */
public class RelationMapper {
    static HashMap<String, Action1> relationMap = new HashMap();
    public static Action1 find(String name) {
        return relationMap.get(name);
    }
    public static void add(Action1 action, String name){
        relationMap.put(name, action);
    }
}
