import java.util.Scanner;

public class HostelAllocation extends UtmeJamb{



    public void Hostel() {
        Scanner input = new Scanner(System.in);

        utmeJamb();

        String gender;
        Boolean hasPaid;

        if (isUtmeJambPassed()) {
            System.out.println("******Dear applicant you have been offered an admission into ICP******");
            System.out.println("\n-------Hostel allocation would be based on paid fees and gender-------");

            System.out.println("Have you paid your complete payment?\n1 for yes\n2 for no");
            int paid = input.nextInt();


            System.out.println("Gender:\n\t M for male\t\tF for female");
            gender = input.next();
            if ((gender.equalsIgnoreCase("F")) && (paid == 1)) {
                System.out.println("You have been posted to the Female Hostel");
            } else if ((gender.equalsIgnoreCase("M")) && (paid == 1)) {
                System.out.println("You have been posted to the Male Hostel");
            } else {
                System.out.println("You need to pay your fees first before hostel allocation.");
            }

        }

    }
}
