package structurizer;

/**
 * Created by i on 31.07.2014.
 */

/**
 * Действие, отображающее зависимость.
 */
public class Action1 {

    public Action1() {
    }

    public void perfom(Entity from, Relation relation){
        System.out.println(from.name + " " + relation.name + " " + relation.to.name);
    }

    private void init(Entity from, Relation relation) {
        //выполнить структурные проверки, такие как наличие связи с воздействием
        System.out.println(from.name + " " + relation.name + " " + relation.to.name);
    }
}
