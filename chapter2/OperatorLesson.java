package chapter2;

public class OperatorLesson {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c= ++b;
        int d = b++;

        a++;
        b++;
        --a;
        System.out.println(--a + ++a); // ++
        System.out.println(a++);
        System.out.println(c + 1);
        System.out.println(d);
    }
    
}
