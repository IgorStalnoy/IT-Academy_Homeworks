package FinalProject;

import java.util.Scanner;

public class IShop {

    public int logInPage() {

        Scanner scanner;

        while (true) {
            switch (getUserChoice()) {
                case 1:
                    enterToShop();
                    break;
                case 2:
                    signingUp();
                    break;
            }
        }
    }

    private void enterToShop() {
    }

    private void signingUp() {
    }

    private int getUserChoice() {
        System.out.println("1 - Sign in");
        System.out.println("2 - Sign up");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


}
