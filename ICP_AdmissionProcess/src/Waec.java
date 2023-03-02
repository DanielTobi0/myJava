import java.util.HashMap;
import java.util.Scanner;

public class Waec {

    private boolean waecPassed;

    public void admitted() {
        HashMap<String, Integer> waecResult = new HashMap<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the correct values for each of the subjects.\nEnter 1 for pass and 0 for fail");
        System.out.println("\n");

        System.out.println("English:");
        int en = input.nextInt();

        System.out.println("Mathematics:");
        int mt = input.nextInt();

        System.out.println("Chemistry:");
        int ch = input.nextInt();

        System.out.println("Biology:");
        int bi = input.nextInt();

        System.out.println("Physics:");
        int ph = input.nextInt();


        // pass 1       fail 0
        waecResult.put("English", en);
        waecResult.put("Mathematics", mt);
        waecResult.put("Chemistry", ch);
        waecResult.put("Biology", bi);
        waecResult.put("Physic", ph);


        int sum = 0;
        for (int i : waecResult.values()) {
            sum += i;
        }
        if (sum >= 5){
            waecPassed = true;
            System.out.println("Waec Passed!!");
        } else{
            System.out.println("Waec Failed");
            System.out.println("Sorry we cannot continue with your application");
        }
        //waecResult.forEach((key, value) -> System.out.println(key + " : " + value));
    }

    public boolean isWaecPassed() {
        return waecPassed;
    }

    public void setWaecPassed(boolean waecPassed) {
        this.waecPassed = waecPassed;
    }
}
