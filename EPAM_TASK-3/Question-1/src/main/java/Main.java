import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        //simple Interest Class Object Creation
        SimpleInterest simpleInterestObject = new SimpleInterest();

        //method that prints simple Interest
        simpleInterestObject.calculateSimpleInterest();

        //Compound Interest Class Object Creation
        CompoundInterest compoundInterestObject = new CompoundInterest();

        //Method that prints Compound Interest
        compoundInterestObject.calculateCompoundInterest();
    }
}
