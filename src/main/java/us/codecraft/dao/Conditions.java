package us.codecraft.dao;

/**
 * @author code4crafer@gmail.com
 */
public class Conditions {

    public static Condition equals(String field, Object value) {
        return new EqualsCondition(field, value);
    }

    public static void main(String[] args) {
        //fizzBuzz = '1' and (buzzWhizz = '2' or fizzWhizz = '3')
        equals("fizzBuzz", "1")
                .and(
                        equals("buzzWhizz", "2").or(equals("fizzWhizz", "3"))
                );

    }
}
