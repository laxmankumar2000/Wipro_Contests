package SelfProgram.HighestOccurrence;
import java.util.ArrayList;
/*
Program date ==> 14/05/2021
Complete date ==> 14/05/2021

Prgoram ==>

You have given a method of solution name and also give int type array and n ;
and your task to find that number which is highest occurrence in the array ;

Example
arr = { 1,2,2,3,2}
ouput = 2

arr = {5,6,8,1,2,5,6,7,4,5}
ouput = 5
 */

public class highestOccurrence {

    public static int solution(int[] arr , int n)
    {
        ArrayList<Integer> value = new ArrayList<>();                   //this contains all numbers present is array without duplicate
        ArrayList<Integer> countvalue = new ArrayList<>();              // this contain how many times number repeat.

        for (int k : arr) {
            int count = 0;
            if (!value.contains(k)) {
                value.add(k);
                for (int i : arr) {
                    if (k == i) {
                        count++;
                    }
                }
                countvalue.add(count);
            }
            else
                continue;
        }
        //here, find max value in countvalue and also find its index
        int maxtimes = countvalue.get(0);
        int index = 0;
        for (int i = 0; i < countvalue.size(); i++) {
            if (maxtimes <countvalue.get(i)) {
                maxtimes = countvalue.get(i);
                index = i;
            }

        }
        return value.get(index);
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,8,3,5,4,5,5,3,1,1,1,1,1,3,3,5};            //ans is 1
//        int[] arr = {5,6,8,1,2,5,6,7,4,5};                  //Ans is 5
        int n = arr.length;
        System.out.println(solution(arr,n));
    }
}
