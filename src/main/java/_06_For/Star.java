package _06_For;

public class Star {
    public static void main(String[] args) {
        /*
         *****
         *****
         *****
         *****
         *****
         */

        for (int i = 0; i < 5; i++) {
            System.out.println("*");
            System.out.println();
        }


        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.print("*");
            }
                System.out.println(); //엔터
            }

        /*

        *
        **
        ***
        ****
        *****

        직각삼각형

         */

        System.out.println();

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();


        }

        }
    }
