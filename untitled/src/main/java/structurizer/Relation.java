package structurizer;

/**
 * Created by i on 31.07.2014.
 */
//заменить на entity и добавить have action
public class Relation {
    String name;
    Entity to;
    Action1 relationAction;

    public Relation(Entity to,Action1 relationAction, String name) {
        this.to = to;
        this.relationAction = relationAction;
        this.name = name;
    }

    public void perfom(Entity from){
        relationAction.perfom(from, this);
    }
}
