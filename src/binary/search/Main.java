/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binary.search;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int NumOfArray = Validation.getIntInRange("Enter number of array: ", 0, Integer.MAX_VALUE);

        BinarySearch bs = new BinarySearch(NumOfArray);

        int searchValue = Validation.getIntInRange("Enter search value: ", 0, Integer.MAX_VALUE);

        bs.display("Sorted array: ");

        int index = bs.binarySearch(searchValue);

        if (index >= 0) {
            System.out.println("Found " + searchValue + " at index " + index);
        } else {
            System.err.println("Not found " + searchValue);
        }

    }

}
