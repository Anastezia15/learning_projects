/*
import java.util.Arrays;

public class Main {
    public static int sum(int x, int y, int z) {

    return x + y + z;
}

    private static int sum(int x, int y) {

        return x + y;
    }


    public  static  void summ(int a,int b)
    {
        a=b++;

    }
    public static void main(String args[]) {
int a=6, b=9;
summ(a++,++b);
        System.out.println(a+" "+b);
*/
/*Arrays.stream(args).map(x-> Integer.parseInt(x)*2).forEach(System.out::println);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }*//*

        char c;
        int i;
        c = 'A';		// 1
        i = c;
        i=c+1;
        c++;
       */
/* System.out.println(args);

        System.out.println(sum(2, 3));
        System.out.println(sum(4, 3,5));*//*

String value="Mom";
        boolean result = Boolean.parseBoolean(value);
        System.out.println(result);

        System.out.println(new Boolean("TRue"));
        Integer val1 = new Integer(5);

    }
}

class MyException extends Exception{

}*/
public class Main {

    public static void Print(String s) {
        System.out.println(s);
    }

    int k = 5;

    public boolean checkIt(int k) {
        return k-- > 0 ? true : false;
    }

    public void printThem() {
        while (checkIt(k)) {
            System.out.print(k--);
        }
    }

    public static void main(String[] args) {
        new Main().printThem();

        int[] array1, array2[];

        array1 = new int[]{1, 2, 3};
        array2 = new int[][]{{1, 2, 3},
                {4, 5, 6}};

        Print("Hello");
    }
}
