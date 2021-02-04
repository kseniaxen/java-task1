package org.ksens.demo.console.task1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = new int[10];
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i<array.length; i++) {
            array[i] = random.nextInt(20 - 1) - 10;
            System.out.println(array[i]);
        }
        int max = array[0];
        int min = array[0];
        int countNega = 0;
        int countPos = 0;
        int countNull = 0;
        for (int item: array) {
            if(max<item){
                max = item;
            }
            if(min>item){
                min=item;
            }
            if(item>0){
                countPos++;
            }else if(item<0){
                countNega++;
            }else{
                countNull++;
            }
        }
        System.out.println("Max: "+ max +" Min: "+ min);
        System.out.println("Count Pos: "+ countPos +" Count Nega: "+ countNega +" Count Null: "+ countNull);

        int[] arrNeg = new int[countNega];
        int[] arrPos = new int[countPos];

        int countEven = 0;
        int countOdd = 0;

        for (int item:array) {
            if(item %2 == 0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        int[] arrEven = new int[countEven];
        int[] arrOdd = new int[countOdd];

        int i = 0;
        int j = 0;
        int k = 0;
        int n = 0;
        for (int item: array) {
            if (item % 2 == 0) {
                arrEven[i] = item;
                i++;
            } else {
                arrOdd[j] = item;
                j++;
            }
            if (item > 0) {
                arrPos[k] = item;
                k++;
            } else {
                arrNeg[n] = item;
                n++;
            }
        }
        System.out.println("Even array:");
        for (int item:arrEven) {
            System.out.print(item + " ");
        }
        System.out.println("\nOdd array:");
        for (int item:arrOdd) {
            System.out.print(item + " ");
        }
        System.out.println("\nNega array:");
        for (int item:arrNeg) {
            System.out.print(item + " ");
        }
        System.out.println("\nPos array:");
        for (int item:arrPos) {
            System.out.print(item + " ");
        }
    }
}
