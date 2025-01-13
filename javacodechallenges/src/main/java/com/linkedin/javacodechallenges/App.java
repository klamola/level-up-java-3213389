package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static boolean isPasswordComplex(String password) {

        return password.length() >= 6 
            && password.matches(".*\\d.*")
            && password.matches(".*[a-z].*")
            && password.matches(".*[A-Z].*");

        // if (password.length() < 6) {
        //     return false;
        // }

        // Boolean hasUpperCase = false;
        // Boolean hasLowerCase = false;
        // Boolean hasDigit = false;

        // for (int i = 0; i < password.length() || !hasUpperCase && hasLowerCase 
        // && !hasDigit; i++) {
        //     char c = password.charAt(i); 
        //     if (Character.isUpperCase(c)) {
        //         hasUpperCase = true;
        //     } else if (Character.isLowerCase(c)) {
        //         hasLowerCase = true;
        //     } else if (Character.isDigit(c)) {
        //         hasDigit = true;
        //     }
        // }

        // return hasUpperCase && hasLowerCase && hasDigit;
   
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }
}
