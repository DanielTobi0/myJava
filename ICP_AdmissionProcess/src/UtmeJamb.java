import java.util.Scanner;

public class UtmeJamb extends Waec{

    private boolean utmeJambPassed;


    public void utmeJamb(){
        admitted();


        Scanner input = new Scanner(System.in);
        int jambScore, utmeScore, finalScore;


        if (isWaecPassed()){
            System.out.println("\n\nEnter Jamb score");
            jambScore = input.nextInt();

            System.out.println("Enter Utme Score");
            utmeScore = input.nextInt();

            finalScore = (jambScore/8) + (utmeScore/2);

            if (isWaecPassed() && (finalScore >= 50)){
                utmeJambPassed = true;
                System.out.printf("You passed, with a score of %d%%", finalScore);
                System.out.println("\n\n");
            }
            else {
                utmeJambPassed = false;
                System.out.printf("You failed, with a score of %d%%", finalScore);
                System.out.println("Sorry we cannot continue with your application");
            }
        }
    }

    public boolean isUtmeJambPassed() {
        return utmeJambPassed;
    }

    public void setUtmeJambPassed(boolean utmeJambPassed) {
        this.utmeJambPassed = utmeJambPassed;
    }
}
