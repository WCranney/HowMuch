import java.util.*;
public class HowMuch {

    private static int N_LOVE_STRINGS = 10;
    private static String[] LOVE_STRINGS = {
        "1",
        "2",
        "3",
        "4",
        "5",
        "6",
        "7",
        "8",
        "9",
        "10",
    };

    public static void main(String[] args) {

        int level;
        Scanner sc = new Scanner(System.in);

        while(true) {

            System.out.println("===================================================================");

            // solicit a love level
            System.out.println("How much do you love me from 1 to 10?");
            
            while(!sc.hasNextInt()) {
                System.out.println("Number not string plz"); 
                sc.nextLine();
            }
            level = sc.nextInt();

            while(!(level >= 1 && level <= 11)) {
                System.out.println("Hey, that's not a number from 1 to 10!");
                sc.nextLine();
                level = sc.nextInt();
            }

            // and send a response (-1 since array is zero-indexed, but level is one-indexed)
            System.out.println(LOVE_STRINGS[level-1]);

            System.out.println("===================================================================");
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }

}
