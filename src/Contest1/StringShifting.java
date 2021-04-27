package Contest1;
/*

program 2
write a program that forms a new sentence upon tailing an input as per the below algorithm.
    shift hte alphabets N number of times in FORWARD mode, where N is the length of a particular word in the given string.

    Example1==
    input1: Hi Hell
    Output: Jk Lipp
    explanation:
     H and i in the word "HI" id shifted 2 times forward as the length of Hi is 2.
    all the alphabets in the word hell are shifted 4 times forward as the  length of Hell is4...
        -- if the alphabet reaches the end of the series, then ir should be reeplaced with zor Z.
        depending on its case.

    Example2;
    input1: ABCDX
    Output: FGHIZ


 */

import java.util.Scanner;

public class StringShifting {



    public static String convert(String str , int count)
    {
        String st = "" ;

        char[] ch = str.toCharArray();                   //convert String into Array
        for (int i = 0; i < ch.length; i++) {
            ch[i]+=count;                                //check the constraint that fill 'z' or 'Z'
            if (ch[i]>122)
            {
                ch[i]='z';
            }
            if (ch[i]>91 && ch[i]<96)
            {
                ch[i] = 'Z';
            }
            st+=ch[i];                              //concat  into st from array
        }
        return st;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hi Hell";                            //Main String
        char []ch = str.toCharArray();                     //Char array
        String s = "";                                     //To Store subSting
        int count = 0;                                      //for length

        StringBuilder sb2 = new StringBuilder();            // for modify String

        int blanck_space = 0;                                //for blank space
        for (char c : ch) {
            if (c != ' ') {
                blanck_space++;
            } else
                break;
        }

        //this loop for to find Modify String By length
        for (char c : ch) {
            if (c != ' ') {
                s += c;
                count++;
            } else {
                sb2.append(convert(s, count));
                count = 0;
                s = "";
                continue;
            }

        }
        sb2.append(convert(s,count));
        sb2.insert(blanck_space,' ');
        System.out.println(sb2);
    }
}
