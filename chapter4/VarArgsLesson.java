package chapter4;

public class VarArgsLesson {
    public int sumOfAllNums (int...y) {
        int sum= 0;
        for (int num :y)
            sum+=num;

        return sum;

    }

    public static float getEarthsGravity {

        
        
    }

    public static void main(String[] args) {
        VarArgsLesson vl = new VarArgsLesson();
        int[] a =  {1,2,3,4,5,6,7,8,9,10};
        System.out.println(vl.sumOfAllNums(1,2,3,4,5,6,7,8,9,10));
        System.out.println(vl.sumOfAllNums(a));
         System.out.println();


    }
}
