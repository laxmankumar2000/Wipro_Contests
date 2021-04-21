package Contest1;


/*
Program1

Date 18-04-2021
Complete == 21-04-2021

Find a key??

You are provided with 3 numbers : input1 , input2 input 3;
each of these are four digit numbers within the range >==1000 and 9999,

you are expected to find the key using the below formula;

key == (sum of largest digits of all the 3 numbers ) + (sum of smallest digits of all 3 numbers)
 for e.g. = input1 = 3521 ; input2 = 2452 , input3 = 1352,  then
 key = (5+5+5) + (1+2+1)
 key = 19;


 */

public class FindAKey {

    //Method for find MAX Value
   static int MaxFind(int input1)
   {
       int max = 0;
       while (input1!=0)
       {
           int num = input1%10;
           max = Math.max(max,num);
           input1 = input1/10;
       }
       return max;
   }

   //Method for find MIN value
   static int MinFind(int input1)
   {
       int min = 100;
       while (input1!=0)
       {
           int num = input1%10;
           min = Math.min(min , num);
           input1 = input1/10;
       }

       return min;
   }


    public static void main(String[] args) {

        //all 3 inputs
        int input1 = 3521;
        int input2 = 2452;
        int input3 = 1352;


        //to find Max and min value for all inputs
        int  Max1 =  MaxFind(input1);
        int Min1  = MinFind(input1);
        int Max2 = MaxFind(input2);
        int Min2 = MinFind(input2);
        int Max3 = MaxFind(input3);
        int Min3 = MinFind(input3);

        //calculated key
        int key = ((Max1 + Max2 + Max3 ) + ( Min1 + Min2 + Min3));
        System.out.println("your key is = " + key);



    }
}
