package structurizer;

import java.util.ArrayList;

/**
 * Created by i on 31.07.2014.
 */
public class Entity {
    String name;
    ArrayList<Relation> relations = new ArrayList<Relation>();

    public Entity(String name) {
        this.name = name;
    }

    public void add(Relation relation){
        relations.add(relation);
    }

}
