import java.io.IOException;
import java.util.Scanner;

public class CompoundInterest {

    protected  void calculateCompoundInterest() throws IOException {

        Scanner scannerObject = new Scanner(System.in);
        //Input values to Calculate Compound Interest
        System.out.println("Input to Calculate Compound Interest");
        System.out.println("Input Principal Amount");
        double principalAmount = scannerObject.nextDouble();

        System.out.println("Input Interest Rate");
        double interestRate = scannerObject.nextDouble();

        System.out.println("Input time period");
        double timePeriod =  scannerObject.nextDouble();


        double temporaryVariable = Math.pow((1+(interestRate/100)), timePeriod);

        double compoundInterest = principalAmount * temporaryVariable;


        System.out.println("The Compound Interest is = "+compoundInterest);
    }
}
