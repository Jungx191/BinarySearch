/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binary.search;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author ADMIN
 */
public class BinarySearch {

    private int[] arr;

    public BinarySearch(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Size must be positive!");
        }
        arr = new int[size];
        generateRandom();
        sort();
    }

    public int[] getArr() {
        return arr;
    }

    public void generateRandom() {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(arr.length);
        }
    }

    public void sort() {
        Arrays.sort(arr);
    }

    public int binarySearch(int searchValue) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == searchValue) {
                return mid;
            } else if (arr[mid] > searchValue) {
                r = mid - 1;
            } else if (arr[mid] < searchValue) {
                l = mid + 1;
            }
        }
        return -1;
    }

    public void display(String mess) {
        System.out.println(mess + " " + Arrays.toString(arr));
    }
}
