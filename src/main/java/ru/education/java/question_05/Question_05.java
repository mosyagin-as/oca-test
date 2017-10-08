package ru.education.java.question_05;

/**
 * What is the result of the following code?
 *   1. abbaaccc
 *   2. abbbaccca
 *   3. bbaaaccc
 *   4. bbaaccca
 *   5. An exception is thrown
 *   6. The code does not compile
 */
public class Question_05 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb);
    }
}
