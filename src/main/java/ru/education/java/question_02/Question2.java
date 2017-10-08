package ru.education.java.question_02;

/**
 * What is the result of the following code?
 *   1. 55
 *   2. 56
 *   3. 66
 *   4. 10
 *   5. 11
 *   6. 12
 *   7. The code does not compile
 */
public class Question2 {
    private int i = 6;
    private int j = i;

    public Question2() {
        i = 5;
    }

    public static void main(String[] args) {
        Question2 question2 = new Question2();
        System.out.println(question2.i + question2.j);
    }
}
