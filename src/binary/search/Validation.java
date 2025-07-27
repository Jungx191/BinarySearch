/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binary.search;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Validation {

    private static final Scanner scanner = new Scanner(System.in);

    public static int getIntInRange(String mess, int min, int max) {
        while (true) {
            System.out.println(mess);
            try {
                int x = Integer.parseInt(scanner.nextLine());
                if (x < min || x > max) {
                    throw new Exception();
                }
                return x;
            } catch (NumberFormatException e) {
                System.err.println("Please input an integer!");
            } catch (Exception e) {
                System.err.println("Please input an integer between " + "[" + min + ", " + max + "]");
            }
        }
    }
}
