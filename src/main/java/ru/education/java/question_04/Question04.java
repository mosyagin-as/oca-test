package ru.education.java.question_04;


/**
 * Which are the true of the following code?
 *   1. The code compiles and outputs gzz.
 *   2. The code compiles and outputs gzgz.
 *   3. If the lines that do not compile are removed, the ode outputs cg
 *   4. If the lines that do not compile are removed, the ode outputs cz
 *   5. If the lines that do not compile are removed, the ode outputs cgzz
 *   6. If the lines that do not compile are removed, the ode outputs cgzzg
 */
public class Question04 {
    String seq = "c";
    static {
//        seq += "g";
    }
    {
        seq += "z";
    }

    public static void main(String[] args) {
        Question04 c1 = new Question04();
        Question04 c2 = new Question04();
        System.out.println(c1.seq);
    }
}
