//Write a program to sort the given array according to frequency of elements.
//Examples :
//Input : {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12}
//Output : {3, 3, 3, 3, 2, 2, 2, 12, 12, 4, 5}
//Input : {0, 2, 1, -1, 1, 2, 0, 4, -1, 4}
//Output : {-1, -1, 0, 0, 1, 1, 2, 2, 4, 4}
//Input : { 4, 6, 8, 2, 5, 7, 9 }
//Output : { 2, 4, 5, 6, 7, 8, 9 }

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class FrequencyOfElements {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter Size Of Elements");
            int n=in.nextInt();
            int[] a = new int[n];
            System.out.println("Enter No.Of Elements Present in Array:");
            for(int i=0;i<n;i++) {
                a[i]=in.nextInt();
            }
            Map<Integer, Integer> map = new HashMap<>();
            List<Integer> Array = new ArrayList<>();
            for (int current : a) {
                int count = map.getOrDefault(current, 0);
                map.put(current, count + 1);
                Array.add(current);
            }
            Sort compare = new Sort (map);
            Array.sort (compare);
            for (Integer i : Array) {
                System.out.print(i + " ");
            }
        }
    }
    class Sort implements Comparator<Integer> {
        private final Map<Integer, Integer> frequency;
        Sort(Map<Integer, Integer> sortFrequency)
        {
            this.frequency = sortFrequency;
        }
        @Override
        public int compare(Integer i1, Integer i2)
        {
            int comparefrequency = frequency.get(i2).compareTo(frequency.get(i1));
            int comparenumbers = i1.compareTo(i2);
            if (comparefrequency == 0)
                return comparenumbers;
            else
                return comparefrequency;
        }
    }
