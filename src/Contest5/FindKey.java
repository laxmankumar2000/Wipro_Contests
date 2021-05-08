package Contest5;
/*
Program date ==> 07/05/2021
Complete date ==> 07/05/2021

Prgoram ==>

You have to given three numbers input1 input2 input3;
and your task to find a key given formula;

Key = [largest digit in the thousands place of all three numbers ][largest digit in the hundreds place if all three numbers]
      [largest digit in the tens place og all three numbers][largest digit un the unit place of three numbers]

For e.g. = if input1 = 3521 ; input2 = 2452 input3 = 1352 then key = 3552;


 */

public class FindKey {
    public static int Key(int input1 , int input2, int input3)
    {

        int thous1 = (input1/1000)%10;
        int thous2= (input2/1000)%10;
        int thous3 = (input3/1000)%10;

        int hund1=(input1/100)%10;
        int hund3=(input3/100)%10;
        int hund2=(input2/100)%10;

        int tens1=(input1/10)%10;
        int tens2=(input2/10)%10;
        int tens3=(input3/10)%10;

        int onc1=(input1%10);
        int onc2=(input2%10);
        int onc3=(input3%10);

        int big1=thous1>thous2?(Math.max(thous1, thous3)):(thous2);
        int big2=hund1>hund2?(Math.max(hund1, hund3)):(hund2);
        int big3=tens1>tens2?(Math.max(tens1, tens3)):(tens2);
        int big4= onc1>onc2?(Math.max(onc1, onc3)):(onc2);



        StringBuilder sb = new StringBuilder();
        sb.append(big1);
        sb.append(big2);
        sb.append(big3);
        sb.append(big4);

        return Integer.parseInt(String.valueOf(sb));

    }

    public static void main(String[] args) {
        int input1 = 3521;
        int input2 = 2452;
        int input3 = 1352;
        System.out.println(Key(input1,input2,input3));
    }
}
