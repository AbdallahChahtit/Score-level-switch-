import java.util.Scanner;

public class ScoreLevel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int w = input.nextInt();

        switch (w){
                     //   case 10:
                        case 90:
                            System.out.println("The score level is A");
                            break;
                        case 80:
                            System.out.println("The score level is B");
                            break;
                        case 70:
                            System.out.println("The score level is C");
                            break;
                        case 60:
                            System.out.println("The score level is D");
                            break;
                        default:
                            System.out.println("The score level is F");
                    }
    }
}


