package structurizer;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by i on 31.07.2014.
 */
public class Structurizer {
    private static HashMap<String, Entity> entityTreeMap = new HashMap<String, Entity>();

    public static void main(String[] args){
        String[] input = {"я", "пнул", "мяч"};
        init();
        Entity entity = entityTreeMap.get(input[0]);
        Entity entity1 = new Entity(input[2]);
        entityTreeMap.put(input[2], entity1);
        entity.add(new Relation(entity1, RelationMapper.find(input[1]), input[1]));
        entity.relations.get(0).perfom(entity);

    }

    private static void init() {
        Action1 action = new Action1();
        RelationMapper.add(action, "пнул");
        entityTreeMap.put("я", new Entity("я"));
    }
}
