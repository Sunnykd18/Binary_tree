package com.company;

public class Quick{
    public static void main(){
        int []a = new int[];


    }
    public static int Partition(int l, int h){
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
}
