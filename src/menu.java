import java.util.Scanner;

public class menu {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter code type to run - 1 for Inputs, 2-For Abstract, 3 for Arrays, 4 - Methods");

        int code = Integer.parseInt(myObj.nextLine());  // Read user input
        System.out.println("Code is: " + code);  // Output user input

       // int day = 4;
        switch (code) {
            case 1:
                System.out.println("Object Input Example");
                inputs myInputsObj = new inputs();
                myInputsObj.myInputs();

                break;
            case 2:
                System.out.println("Abstract Input Example");
                inputs myABSInputsObj = new absinputs() {

                /*
                    @Override
                    public void absinputs() {
                        System.out.println("Overridden Method absinputs");
                    }
*/
                };
                myABSInputsObj.myInputs();


                break;
            case 3:
                System.out.println("Array Exmple");
                System.out.println("Array Input Example");
                break;
            case 4:
                System.out.println("Method Example");
                System.out.println("Method Input Example");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
// Outputs "Thursday" (day 4)

    }
}
