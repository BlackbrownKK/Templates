package annotation;

@BaseAction(level = 2, sqlRequest = "SELECT name, phone FROM phonebook")
public class Base {
    public void doAction() {
        Class clazz = Base.class;
        BaseAction action = (BaseAction) clazz.getAnnotation(BaseAction.class);
        System.out.println(action.level());
        System.out.println(action.sqlRequest());
    }
}
