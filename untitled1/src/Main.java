import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String equation = scan.nextLine();
        split(equation);


    }

    public static void split(String d) {

//        int counter = 1;
//        double[] coefficient;
//        double[] power;
//        coefficient = new double[100];
//        power = new double[100];
        double co;
        double p;


        String[] arrOfStr = d.split("\\+");
        for (String a : arrOfStr) {
            System.out.println("Term:" + a);

            String[] arrOfStr2 = a.split("\\^");

            String[] arrOfStr3 = arrOfStr2[0].split("x");
            for (String c : arrOfStr3) {

                System.out.println("Cofficient: " + c);

                co = Double.parseDouble(c);

                if (arrOfStr2.length == 2) {
                    System.out.println("Power:" + arrOfStr2[1]);

                    p = Double.parseDouble(arrOfStr2[1]);


                } else {p = 0;}


            }


        }

    }


}
