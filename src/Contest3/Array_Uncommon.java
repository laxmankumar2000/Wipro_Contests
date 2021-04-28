package Contest3;

/*
Program 3:
Program date == 25/04/2021;
Complete date == 28/04/2021;

You have a method which is passes  two array of integer type. you have to find uncommon elements
 aftermath you  have tp digital sum of uncommon element...

 Explanation:
 arr1 =[7,8,3,6,4,5]
 arr2 = [7,3,6,5,2]

 the uncommon element are 8,4,2. the sum is 8+6+2 = 16. but you have to find digital sum.
 digital sum = 1+6 = 7;

 */

public class Array_Uncommon {

    public static int UnCommon(int[] arr1 , int[] arr2)
    {
        int count1 = 0;                                        //To get element of array 1 which is not common
        int count2 = 0;                                        //to store element of array 2 which is not common
        int sum = 0;                                           //this is sum of count1 and count2
        boolean status = true;
        for (int k : arr1) {
            status = true;
            for (int i : arr2) {
                if (k == i) {
                    status = false;
                    break;
                }
            }
            if (status) {
                count1 += k;
            }
        }

        for (int k : arr2) {
            status = true;
            for (int i : arr1) {
                if (k == i) {
                    status = false;
                    break;
                }
            }
            if (status) {
                count2 = count2 + k;

            }
        }

        sum = count1+count2;
        int temp = sum;
        int Final_Sum=0;

        while(sum!=0)                                         //for Digital Sum
        {
            int n = sum%10;
            Final_Sum +=n;
            sum/=10;
        }
        return Final_Sum;

    }

    public static void main(String[] args) {
        int[] arr1 = {7,8,3,5,1,4,9};
        int[] arr2 = {7,3,5,8,6,2};
        int result = UnCommon(arr1 , arr2);
        System.out.println(result);
    }

}
