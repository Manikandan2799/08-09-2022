



package Javapractices;

import java.util.Scanner;

public class SpiralPatternMatrix {
public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int[][] spiral =new int[size][size];
        int i=1,minCol=0,maxCol=size-1,minRow=0,maxRow=size-1;
        while(i<=size*size) {
            for(int j=minCol;j<=maxCol;j++) spiral[minRow][j] = i++;
            for( int j=minRow+1;j<=maxRow;j++) spiral[j][maxCol] = i++;
            for(int j=maxCol-1;j>=minCol;j--) spiral[maxRow][j] = i++;
            for( int j=maxRow-1;j>=minRow+1;j--) spiral[j][minCol] = i++;
            minCol++;
            maxCol--;
            minRow++;
            maxRow--;
        }
        for(int l=0;l<size;l++) {
            for(int k=0;k<size;k++) System.out.print (spiral[l][k] + "  ");
            System.out.println();
        }
    }

}
