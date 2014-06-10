package us.codecraft.dao;

/**
 * @author code4crafer@gmail.com
 */
public interface Condition {

    public Condition and(Condition and);

    public Condition or(Condition or);
}
