package com.company;

public class Quick{

    public static void Swap(int []a, int i , int j){
        int temp = a[i];
        a [i] = a [j];
        a[j] = temp;
    }

    public static int Partition(int l, int h){
        int []a = new int[8];
        int pivot = a[l];
        int i = l;
        int j = h;

        while( i < j ){
            while (a[i] < pivot){
                i++;
            }
            while (a[i] > pivot){
                i++;
            }
            if( i < j ){
                Swap(a, i, j);
            }
        }
        Swap(a, l, j);
        return j;
    }
    public static void QuickSort(int l, int h){
        if( l < h ){
            int pivot = Partition(l,h);
            QuickSort(l,pivot-1);
            QuickSort(pivot+1, h);
        }
    }
    public static void main(String[] args){
        int  [] a = {2,6,5,4,3,7,8,9,10};
        QuickSort(0,10);
        System.out.println(a);
    }
}
