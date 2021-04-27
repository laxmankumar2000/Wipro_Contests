package Contest2;

/*
Program Description


Write a function to find the count of non repeated digits in a given number N .
The number will be passes to the function as an input parameter of type int.

Some example are as below
 1. if the given number is 292,the function should return 1 because there is only 1 non - repeated digit that is 9 ....
 2.if the given number is 1015,the function should return 2 because there is only 2 non - repeated digit that is 0,5 ....
 3.if the given number is 108,the function should return 3 because there is only 3 non - repeated digit that is 1,0,8 ....
 4.if the given number is 22,the function should return 0 because there is only 0 non - repeated digit that is 0 .....


Program Date = 23/04/21;
Complete Date = 27/04/2021;
 */

import java.util.ArrayList;

public class NonRepeatedDigit {

    public int Solution( int input1)                                 // Int Method
    {
        //Here i create a Arraylist that contain the element of input val in reverse order.
        // Main motive for use that is To find the Total length of Input variable..

        ArrayList<Integer> al = new ArrayList<>();                   // Initialization
        int temp2 = input1;
        while(temp2>0)
        {
            int res = temp2%10;
            al.add(res);                                               //Add into ArrayList
            temp2/=10;
        }

        int total_length = al.size();                                   //Get toatal size of ArrayList

        //the logic is that-----
        // cunt is an array type. using while loop, i increased in index of 0 to 9 element that comes in any times. then find element that frequncy is greater than 1.
        int res = 0 ;
        int cunt[] = new int[10];
        int temp = input1;
        while(temp >0)
        {
            res = temp%10;
            cunt[res]++;                            // this line increased in index that how many times is comes. Note that it increase index value not element....
            temp/=10;
        }

        int repeated=0;
        for (int i = 0; i <10; i++) {
            //check element that i frequncy greater than 1
            if (cunt[i] > 1)
            {
                 repeated= cunt[i];             // that element store in this variable...
            }

        }
        //to find non-repeated value , i subtract repeated value from  total length
        int non_repeated = total_length-repeated;

        return non_repeated;
    }

    public static void main(String[] args)
    {
        int input1=242;

        NonRepeatedDigit obj = new NonRepeatedDigit();
        System.out.println(obj.Solution(input1));

    }

    // This logic is valid for only given test cases and also for only one digit is repeated......
    //if more than two digit is repeate this is not suitable logic........    THANKS.
}


