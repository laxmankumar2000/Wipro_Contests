package Contest4;
/*
You have given three number input1 input2 input3
your task is to find a key using this formula

key = (Hundreds digit of inputs1 * tens digit of input2)-(Largest digit of input3)

For e.g. = if input1 = 3521; input2 = 2452; input3=1352

then key = (5*5)-5=20;

 */

public class FindKey {
    public static int Key(int input1 , int input2 , int input3)
    {
        int hund = 0;
        int tens = 0;
        int max = 0;
        int Key = 0;

        hund = (input1/100)%10;
        tens = (input2/10)%10;

        while(input3>0)
        {
            int n = input3%10;
            max = Math.max(max,n);
            input3/=10;
        }

        Key = ((hund*tens)-max);
        return Key;


    }

    public static void main(String[] args) {
        int input1 = 3521;
        int input2 = 2452;
        int input3 = 1352;
        System.out.println(Key(input1,input2,input3));
    }
}
