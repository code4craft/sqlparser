package us.codecraft.dao;

/**
 * @author code4crafer@gmail.com
 */
public class EqualsCondition implements Condition{

    private String name;

    private Object value;

    public EqualsCondition(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public Condition and(Condition and) {
        return null;
    }

    @Override
    public Condition or(Condition or) {
        return null;
    }
}
