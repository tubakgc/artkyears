import java.util.Scanner;
public class artiky {

    public static void main(String[] args) {
        int year;
        Scanner input= new Scanner(System.in);

        System.out.print("yılı giriniz:");
        year=input.nextInt();


        if (year % 4 == 0) {
            System.out.print("artık yıl");

            if ((year % 100 == 0 ) && (year % 400 == 0)) {
                System.out.print("artık yıl");

            }
        }else {
            System.out.print("artık yıl değildir");
        }

    }
}
