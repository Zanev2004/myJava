public class methodoutput {
     static int myMethod(int x, int y) {
         System.out.println(x+y);
         return x + y;
    }

    public static void main(String[] args) {
        int z = myMethod(5, 3);
        System.out.println(z);
        z = z + 4;
        System.out.println(z);
        //abc

    }
}

