package com.lab;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;


public class testSelectionSort {
	
	public void test() {
		testPositive();
		testNegative();
	    testMixed();
		testDuplicates();
	}

	public testSelectionSort() {
    }
    @Test
    public void testPositive(){
    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        SelectionSort test = new SelectionSort();
        arr = test.basicSelectionSort(arr);
        assertArrayEquals(Sortedarr, arr);
    }
    @Test
    public void testNegative(){
    	int[] arr = new int[5];
        arr[0] = -98;
        arr[1] = -59;
        arr[2] = -5;
        arr[3] = -1;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -98;
        Sortedarr[1] = -59;
        Sortedarr[2] = -5;
        Sortedarr[3] = -2;
        Sortedarr[4] = -1;
        
        SelectionSort test = new SelectionSort();
        arr = test.basicSelectionSort(arr);
        assertArrayEquals(Sortedarr, arr);
    }
    @Test
    public void testMixed(){
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = -10;
        arr[4] = -22;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -22;
        Sortedarr[1] = -10;
        Sortedarr[2] = -8;
        Sortedarr[3] = 7;
        Sortedarr[4] = 9;
        
        SelectionSort test = new SelectionSort();
        arr = test.basicSelectionSort(arr);
        assertArrayEquals(Sortedarr, arr);
    }
    @Test
    public void testDuplicates(){
    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 8;
        arr[2] = -7;
        arr[3] = -7;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -7;
        Sortedarr[1] = -7;
        Sortedarr[2] = 2;
        Sortedarr[3] = 8;
        Sortedarr[4] = 8;
        
        SelectionSort test = new SelectionSort();
        arr = test.basicSelectionSort(arr);
        assertArrayEquals(Sortedarr, arr);
    }
}
