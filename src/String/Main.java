package String;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {


    public static void main(String[] args) {

        //System.out.println(reverse());// 1
        //  System.out.println(amountWords());// 2
        Scanner scanner = new Scanner(System.in); //3
       // String s = scanner.nextLine();
        //  nrEachChar(s);
        /*System.out.println(s.toUpperCase());
        System.out.println(s);
        String line="hi";
        line="hello";*/
        //  withoutRepChars(s);
       /* String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();
        System.out.println(newWord(s, s1, s2, s3));
        alphOrder(s, s1, s2, s3);*/
        //unitWords(s,s1,s2);
        // System.out.println(amountNumbers(s));//3
       // System.out.println(longestPalindrome(s));
        int [] array=new int[]{1,2,3,1,1,7,8,9,3,4,5};
       // System.out.println(majorNumber(array));
//
//        String f="love";
//        f="joke";
//        System.out.println(f);

        System.out.println(amountNumbers("kdsfh4433dkfh"));


    }

    public static int majorNumber(int[] array)
    {int number=0;
        int count=0;
        int maxCount=0;
        for (int i = 0; i < array.length; i++) {
            count=0;
            for (int j = 1; j < array.length; j++) {
            if (array[i]==array[j])
            {
                count++;
            }
            }
            if (count>maxCount)
            {
                maxCount=count;
                if (count>array.length/2)
                number=array[i];
                else number=-1;
            }
        }
        return number;
    }
    public static Boolean isPalindrome(String s) {
        boolean b = false;
        char[] charS = s.toCharArray();
        for (int i = 0; i < charS.length/2; i++) {
            if (charS[i] == charS[charS.length - 1 - i]) b = true;
            else {
                b = false;
                break;
            }
        }
        return b;
    }

    public static String longestPalindrome(String s) {
        char[] strArr=s.toCharArray();
        int count=0;
        int maxCount=0;
        int tempI=0,tempJ=0;
        String result=" ";
        for (int i = 0; i < strArr.length; i++) {
            count=0;
            for (int j = i+1; j < strArr.length; j++) {
                if(isPalindrome(s.substring(i,j+1))){
                    count++;
                    tempI=i;
                    tempJ=j;
                }
            }
            if (count>maxCount){
                maxCount=count;
                result=s.substring(tempI,tempJ+1);
            }
        }
        return result;
    }


    //9
    public static void nrEachChar(String s) {
        int[] count = new int[]{0, 0, 0, 0};
        char[] arr = s.toCharArray();
        for (char c : arr) {
            switch (c) {
                case 'a' -> ++count[0];
                case 'b' -> ++count[1];
                case 'c' -> ++count[2];
                case 'd' -> ++count[3];
                default -> System.out.println("Unknown letter");
            }
        }
        System.out.println("a " + count[0] + " times " + "\n" + "b " + count[1] + " times " + "\n" + "c " + count[2] + " times" + "\n" + "d " + count[3] + " times");
    }

    //8
    public static void withoutRepChars(String s) {
        char[] arr = s.toCharArray();
        int count = 0;
        int count2 = 0;
        char[] a = new char[arr.length];
        for (char c : arr) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (a[j] == c) {
                    count++;
                }
            }
            if (count == 0) {
                ++count2;
                a[count2] = c;
            }
        }

        s = Arrays.toString(a);
        System.out.println(s);
    }

    //6
    public static void alphOrder(String a, String b, String c, String d) {
        String[] array = new String[]{a, b, c, d};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    //5
    public static String newWord(String a, String b, String c, String d) {
        String s = a.substring(0, 2).concat(b.charAt(0) +
                c.substring(0, 3) +
                d.substring(0, (d.length()) / 2));
        return s;

    }

    //3
    public static int amountNumbers(String s) {
        return (int)s.chars()
                .filter(x-> (x >= Constants.FIRST_NUMBER_ASCII_CODE && x <= Constants.LAST_NUMBER_ASCII_CODE)).count();

//        intStream.filter(x-> x > )

//        int count = 0;
//        boolean ver1 = true;
//        for (char str : strS) {
//            try {
//                Integer verification = Integer.parseInt(String.valueOf(str));
//                ver1 = true;
//            } catch (NumberFormatException e) {
//                ver1 = false;
//            }
//            if (ver1) {
//                count++;
//            }
//        }
//        return count;

    }

    //1
    public static String reverse() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] temp = s.toCharArray();
        for (int i = 0; i < temp.length / 2; i++) {
            char a = temp[i];
            temp[i] = temp[temp.length - 1 - i];
            temp[temp.length - 1 - i] = a;
        }
        s = Arrays.toString(temp);
        return s;
    }

    //2
    public static int amountWords() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] temp = s.toCharArray();
        int count = 1;
        for (int i = 1; i < temp.length; i++) {
            char space = ' ';
            if (temp[i] == space && temp[((temp.length - 1) - (temp.length - 1 - i)) - 1] != space && i != (temp.length) - 1) {
                count++;
            }

        }
        return count;
    }

    //4
    public static void unitWords(String a, String b, String c) {
        //  String s= a.concat(" " + b+" " + c +".") ;
        String s = String.join(" ", a, b, c, ".");
        System.out.println(s);
    }
}
