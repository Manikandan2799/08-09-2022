// Given an array of random numbers, Push all the seven's of a given array to the end of the array.
// For The order of all other elements should be same.
// Examples :
// Input : {1, 9, 8, 4, 7, 7, 2, 0, 7, 6, 7}
// Output : {1, 9, 8, 4, 2, 0, 6, 7, 7, 7, 7}.
// Input : {3, 7, 3, 7, 3, 7, 3, 7}
// Output : {3, 3 , 3 , 3, 7, 7, 7, 7}

package JavaPractices;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfRandomNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter Length Of Array" );
        int n=in.nextInt ();
        int[] array_nums = new int[n];
        System.out.println ("Enter Elements" );
        for (int i = 0; i <n ; i++) array_nums[i] = in.nextInt ( );
        System.out.println("Original Array: "+Arrays.toString(array_nums));
        int i,j,temp;
        int length = array_nums.length;
        for(i = 0; i < length; i++)
        {
            if(array_nums[i] == 7)
            {
                for(j = i; j < length - 1; j++)
                {
                    temp = array_nums[j];
                    array_nums[j] = array_nums[j+1];
                    array_nums[j+1] = temp;
                }
                length--;
            }
        }

        System.out.println("After pushing "+ Arrays.toString(array_nums));
    }
}
