import java.io.*;
import java.util.Scanner;

public class SimpleInterest {
    public void calculateSimpleInterest() throws IOException {

       //Scanner Object
        Scanner scannerObject = new Scanner(System.in);

        //Input values to Calculate Simple Interest
        System.out.println("Input to Calculate Simple Interest");
        System.out.println(" what is principal Income");
        double principalIncome = scannerObject.nextDouble();

        System.out.println("Input rateOfInterest");
        double rateOfInterest = scannerObject.nextDouble();

        System.out.println("Input Number Of Years");
        double numberOfYears =  scannerObject.nextDouble();

        double simpleInterest = (principalIncome * rateOfInterest * numberOfYears)/100.0;

        System.out.println("The Simple Interest is ="+simpleInterest);

    }

}
