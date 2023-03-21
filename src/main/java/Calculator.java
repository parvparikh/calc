
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int op, flag=0;
        double num, exp;
        int numi;

        do{
            System.out.println("Scientific Calculator");
            System.out.println("1. Square root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Log");
            System.out.println("4. Power");
            System.out.println("5. Exit");
            System.out.print("Enter a Choice : ");
            op = reader.nextInt();
            System.out.println("");
            if(op==5) flag = 1;
            else{
                switch(op){

                    case 1:  // Square Root
                        System.out.print("SquareRoot of : ");
                        num = reader.nextDouble();
                        squareRoot(num);
                        break;

                    case 2: //Factorial
                        System.out.print("Factorial of : ");
                        numi = reader.nextInt();
                        factorial(numi);
                        break;

                    case 3: //Natural Log
                        System.out.print("NaturalLog of: ");
                        num = reader.nextDouble();
                        naturalLog(num);
                        break;

                    case 4: //Power
                        System.out.print("Power of : ");
                        num = reader.nextDouble();
                        System.out.print("with exponent: ");
                        exp = reader.nextDouble();
                        power(num,exp);
                        break;

                    default:
                        System.out.println("Exiting due to invalid input!!");
                        flag = 1;
                }
            }
        }while(flag == 0);
    }

    public static double squareRoot(double num){
        double c = Math.sqrt(num);
        System.out.println("");
        System.out.println("squareRoot("+num+") = "+c);
        System.out.println("");
        logger.info("squareRoot function executed");
        return c;
    }

    public static int factorial(int num){
        int c = num ;
        for(int i=num-1; i>=1; i--) c = c*i;
        System.out.println("");
        System.out.println("factorial("+num+") = "+c);
        System.out.println("");
        logger.info("Factorial function executed");
        return c;
    }
    public static double naturalLog(double num){
        double c = Math.log(num);
        System.out.println("");
        System.out.println("naturalLog("+num+") = "+c);
        System.out.println("");
        logger.info("NaturalLog function executed");
        return c;
    }
    public static double power(double num, double exp){
        double c = Math.pow(num,exp);
        System.out.println("");
        System.out.println("power("+num+","+exp+") = "+c);
        System.out.println("");
        logger.info("Power function executed");
        return c;
    }

}