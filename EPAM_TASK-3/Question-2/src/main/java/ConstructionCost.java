import java.io.*;
import java.util.Scanner;

public class ConstructionCost {


    protected void constructionCostCalculator() throws IOException {

        //Scanner Object
        Scanner scannerObject = new Scanner(System.in);

        //input prompt
        System.out.println("Enter the material Standard you want to use to construct the house");

        System.out.println("1. Standard Material"+"\n"+
                    "2. Above Standard Material"+"\n"+
                    "3. High Standard Material"+"\n"+
                    "4. High Standard Material and Fully Automated Home"+"\n"
        );
        int variableToUseInSwitchCase = Integer.parseInt(scannerObject.next());

        //input for total area
        System.out.println("Input the total Area");
        double totalArea  = Double.parseDouble(scannerObject.next());

        //initializing cost for total area variable
        double costForTotalArea = 0;

        switch (variableToUseInSwitchCase){
            case 1:
                costForTotalArea = 1200 * totalArea;
                break;
            case 2:
                costForTotalArea = 1500 * totalArea;
                break;
            case 3:
                costForTotalArea = 1800 * totalArea;
                break;
            case 4:
                costForTotalArea = 2500 * totalArea;
                break;

        }
        System.out.println(costForTotalArea);

        //closing output stream
        System.out.close();

        //closing input stream
        scannerObject.close();

    }
}
