package Trial2;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class InterviewPrep {
    public static List<Integer> list = new ArrayList<>();

    static {
        int count = -5;
        for (int i = 0; i < 10; i++) {
            list.add(++count);
        }
    }

    public void deleteNegNumb() {
        //  list = list.stream().filter(el -> el >= 0).collect(Collectors.toList());
        // list = list.stream().map(el -> el * 2).collect(Collectors.toList());

        list.removeIf(integer -> integer < 0);

    }


    public static void main(String[] args) throws Exception {
       /* InterviewPrep list1 = new InterviewPrep();
        System.out.println(list);
        list1.deleteNegNumb();
        System.out.println(list);*/
        /*String a = "worldvaaaaa";
        String b = "boldfaaaaaaaa";
        System.out.println(mutualString(a, b));*/
        /*int a = 1, b = 9, c = 3;
        System.out.println(maxN(a, b, c));*/
        String s = "aaabcabc";
        System.out.println(longestStr(s));


    }

    static public String mutualString(String a, String b) {
        String newS = " ";
        int count = 0;
        int tempCount = 0;
        int tempJ = 0;
        for (int i = 0; i < b.length(); i++) {
            tempCount = 0;
            for (int j = i + 1; j <= b.length(); j++) {
                String n = b.substring(i, j);
                if (a.contains(b.substring(i, j))) {
                    tempCount++;
                    tempJ = j;
                } else {
                    if (tempCount != 0) break;
                    ;
                }

            }
            if (tempCount > count) {
                newS = b.substring(i, tempJ);
                count = tempCount;
            }
        }

        return newS;
    }

    static public int maxNumber(int a, int b, int c) {
        int max = 0, min = 0, mid = 0, temp = 0;
        if (a > b && a > c) {
            max = a;
            if (b > c) {
                mid = b;
                min = c;
            } else {
                min = b;
                mid = c;
            }
        } else if (a > b && a < c) {
            max = c;
            mid = a;
            min = b;
        } else if (a > c && a < b) {
            max = b;
            mid = a;
            min = c;
        } else if (a < b && a < c) {
            min = a;
            if (b > c) {
                max = b;
                mid = c;
            } else {
                max = c;
                mid = b;

            }

        }
        String tempS = Integer.toString(max).concat(Integer.toString(mid).concat(Integer.toString(min)));
        temp = Integer.parseInt(tempS);
        return temp;
    }

    public static int maxN(int a, int b, int c) {
        String result = " ";
        int[] arr = new int[]{a, b, c};
        Arrays.sort(arr);
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int j : arr) {

            result = result.concat(Integer.toString(j));

        }
        temp = Integer.parseInt(result.trim());
        return temp;
    }


    public static String longestStr(String s) throws Exception{

            char[] str = s.toCharArray();
            if (s.length() == 0) throw new Exception("Your string is empty");
            if (s.length() == 1) return s;
            String newS = "";
            String result = "";
            int count = 0, tempCount = 0;
            for (int i = 1; i < s.length(); i++) {
                if (str[i - 1] != str[i] && !newS.contains(Character.toString(str[i]))) {
                    if (newS.isEmpty())newS+=str[i-1];
                    newS += str[i];
                    tempCount++;
                } else {
                    if (tempCount != 0) {
                        tempCount = 0;
                        newS = "";
                    }

                }
                if (tempCount > count) {
                    count = tempCount;
                    result = newS;
                }

            }
            return result;

    }
}
