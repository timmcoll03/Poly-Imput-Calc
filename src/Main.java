import java.util.Scanner;
import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String equation = scan.nextLine();
        split(equation);


    }

    public static void split(String d) {
        int counter = 1;
        String[] arrOfStr = d.split("\\+");
        for (String a : arrOfStr)  counter++;
        double[] coefficient;
        double[] power;
        coefficient = new double[counter];
        power = new double[counter];
        ArrayList <Term> terms = new ArrayList<Term>();


        for (String a : arrOfStr) {
            System.out.println("Term:" + a);

            String[] arrOfStr2 = a.split("\\^");

            String[] arrOfStr3 = arrOfStr2[0].split("x");
            for (String c : arrOfStr3) {

                System.out.println("Cofficient: " + c);

                coefficient[counter-1] = Double.parseDouble(c);



                if (arrOfStr2.length == 2) {
                    System.out.println("Power:" + arrOfStr2[1]);

                    power[counter-1] = Double.parseDouble(arrOfStr2[1]);


                } else {power[counter-1] = 1;}

                terms.add(new Term(coefficient[counter-1],power[counter-1]));
                System.out.println("Term Coefficient is " + coefficient[counter-1]);
                System.out.println("Term Power is " + power[counter-1]);



            }


        }



    }


}
