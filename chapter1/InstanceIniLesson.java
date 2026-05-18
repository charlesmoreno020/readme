package chapter1;

public class InstanceIniLesson {
    int code = 0;
    {
        System.out.println(code);
    }

    public static void main(String[] args) {
        InstanceIniLesson ini; new InstanceIniLesson();
    {System.out.println("feathers");}
        
    }
    
    {
            System.out.println("Snowy");
            code = 100;
            System.out.println(code);

    }
}

