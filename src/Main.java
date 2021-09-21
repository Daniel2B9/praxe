import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] valids = {"k", "v", "help"};
        boolean isValid = false;
        for (String validSymbol : valids) {
            if (validSymbol.equals(args[0])) {
                isValid = true;
            }
        }
        if (!isValid) {
            System.out.println("Bad arg");
            System.exit(-1);
        }

        switch (args[0]) {
            case "k":
                System.out.println("Kalkulacka");
                System.out.println(args);
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                switch (args[1]) {
                    case "s":
                        System.out.println(a + b);
                        break;
                    case "o":
                        System.out.println(a - b);
                        break;

                    case "d":
                        System.out.println(a / b);
                        break;


                    case "n":
                        System.out.println(a * b);
                        break;
                    default:
                        System.out.println("chyba lol");
                        break;
                }

                break;
            case "v":
                System.out.println("Věty na samohlasky");
                String v = sc.nextLine();
                char[] samohlasky = {'a', 'e', 'i', 'o', 'u'};
                char[] charText = v.toCharArray();
                int pocet = 0;
                for (char symbol : charText) {
                    for (int i = 0; i < samohlasky.length; i++) {
                        if (symbol == samohlasky[i]) {
                            pocet++;
                        }
                    }
                }
                System.out.println(pocet);

                break;
            case "help":
                System.out.println("k = kalkulacka v=věty na samohlasky");
                break;
            default:
                System.out.println("zadal si to spatne");
                System.out.println("k = kalkulacka v=věty na samohlasky");
                break;
        }
        System.out.println("zmena");


    }
}
