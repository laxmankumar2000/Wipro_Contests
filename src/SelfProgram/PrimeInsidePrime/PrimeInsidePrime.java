package SelfProgram.PrimeInsidePrime;

/*
Given two integers L and R, the task is to find the count of total numbers of prime numbers in the range [L, R]
 whose sum of the digits is also a prime number.
Examples:

Input: L = 1, R = 10
Output: 4
Explanation:
Prime numbers in the range L = 1 to R = 10 are {2, 3, 5, 7}.
Their sum of digits is {2, 3, 5, 7}.
Since all the numbers are prime, hence the answer to the query is 4.

Input: L = 5, R = 20
Output: 3
Explanation:
Prime numbers in the range L = 5 to R = 20 are {5, 7, 11, 13, 17, 19}.1
Their sum of digits is {5, 7, 2, 4, 8, 10}.
Only {5, 7, 2} are prime, hence the answer to the query is 3.

 */

import java.util.ArrayList;

public class PrimeInsidePrime {
    public static int solution(int l , int r)
    {
        ArrayList<Integer> al = new ArrayList<>();              //ArrayList For store Prime Number in range

        //for Prime number
        for (int i = l; i < r; i++) {
            boolean status =false;
            for (int j = 2; j < i/2 ; ++j) {
                if (i%j==0)
                {
                    status = true;
                    break;
                }

            }

            if (!status)
            {
                al.add(i);
            }
            else
                continue;

        }

        ArrayList<Integer> all = new ArrayList<>();                          // This ArrayList for Calculate digital sum of Prime number.
        for (int i = 0; i < al.size(); i++) {
            int temp = al.get(i);
            int sum = 0 ;
            while (temp>0)
            {
                int n = temp%10;
                sum = sum + n;
                temp/=10;
            }
            all.add(sum);
        }
//        System.out.println(al);
//        System.out.println(all);

        int count = 0;
        boolean flag = false;
        for (int i =0;i<all.size();i++)                               //This loop is use for count prime number after digital sum.
        {
            int temp = all.get(i);
            for (int j = 2; j <temp/2 ; ++j) {
                if (temp%j==0)
                {
                    flag = true;
                    break;
                }
            }
            if (!flag)
            {
                count++;
            }
        }

        if (all.contains(4))                                             //if 4 is present then count -1 .
        {
            count= count-1;
        }
        return count;

    }

    public static void main(String[] args) {

        int l =5;
        int r = 20;
        System.out.println(solution(l,r));


    }
}