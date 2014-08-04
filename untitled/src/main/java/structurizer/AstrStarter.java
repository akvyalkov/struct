package structurizer;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by i on 31.07.2014.
 */
public class AstrStarter {
    private static HashMap<String, Entity> entityTreeMap = new HashMap<String, Entity>();
    private static HashMap<String, Action1> relationTreeMap = new HashMap<String, Action1>();

    public static void main(String[] args){
        String[][] inputs = {{"я", "пнул", "мяч"}, {"я", "выпил", "кофе"}, {"я", "принес", "торт"}};
        init();
        for (String[] input : inputs) {
            autoFind();


            Entity entity = entityTreeMap.get(input[0]);
            Entity entity1 = new Entity(input[2]);
            entityTreeMap.put(input[2], entity1);
            entity.add(new Relation(entity1, relationTreeMap.get(input[1]), input[1]));
            // mirroring relations
            entity1.add(new Relation(entity, relationTreeMap.get(input[1]), input[1]));
        }
        execActionsAroundEntity(entityTreeMap.get("я"));
        execActionsAroundEntity(entityTreeMap.get("мяч"));
        execActionsAroundEntity(entityTreeMap.get("торт"));
        execActionsAroundEntity(entityTreeMap.get("письмо"));
    }

    /**
     * автоматическое распознание сущностей в строке
     */
    private static void autoFind() {
        // чтобы искать во всех сущностях, нодо создавать контекст предложения (пс: так же стоит обратить внимание на прилогательные)
//            for (String s : input) {
//                Entity entity = entityTreeMap.get(s);
//                if (entity == null) {
//                    Action1 action = relationTreeMap.get(s);
//                    if (action != null) {
//
//                    } else {
//                        // уточняем у пользователя, что это и создаем новый объект в E или R
//                    }
//                }
//            }
    }

    private static void execActionsAroundEntity(Entity entity) {
        for (Relation relation : entity.relations) {
            System.out.printf("\t"); relation.perfom(entity);
        }
    }

    private static void init() {
        Action1 action = new Action1();
        relationTreeMap.put("пнул",action);
        relationTreeMap.put("съел",action);
        relationTreeMap.put("выпил",action);
        relationTreeMap.put("написал",action);
        relationTreeMap.put("принес",action);
        entityTreeMap.put("я", new Entity("я"));
        entityTreeMap.put("торт", new Entity("торт"));
        entityTreeMap.put("кофе", new Entity("кофе"));
        entityTreeMap.put("письмо", new Entity("письмо"));
    }
}
