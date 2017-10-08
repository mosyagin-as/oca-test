package ru.education.java.question_03;

/**
 * Which are the true statement about the following code?
 * (choose all that apply)
 *   1. The code compiles
 *   2. The code does not compile
 *   3. Exactly one variable is automatically initialized
 *   4. Exactly two variables are automatically initialized
 *   5. num is a class variable
 *   6. integer is a class variable
 */
public class Type {
    int integer;
    static int num;
    public Type () {
        int type;
//        System.out.println(type);
    }

    @Override
    public String toString() {
        return "Type{" +
                "integer=" + integer +
                '}';
    }

    public static void main(String[] args) {
        Type type = new Type();
        System.out.println(type.toString());
        System.out.println(num);
    }
}
