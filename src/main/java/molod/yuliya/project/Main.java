package molod.yuliya.project;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import molod.yuliya.project.ArrayTest;
import molod.yuliya.project.LinkedTest;

/**
 * Class Main
 * @author Molod Yuliya
 * @version 1.0
 */
public class Main {

    /** The main function with the execution of class methods
     * @param args string[] args
     */
    public static void main (String[] args) {

        Scanner text = new Scanner(System.in);
        int NumberIteration;

        ArrayTest Array = new ArrayTest();
        LinkedTest Linked = new LinkedTest();

        String stopLitera;
        do {
            System.out.println("Enter the number of iterations: ");
            NumberIteration = InputNumberIteration(text);

            Array.SetCountIteration(NumberIteration);

            System.out.println("Results Array tests: ");

            System.out.println("Method Add: number of repeat - " + NumberIteration + ", " + Array.TestMethodAdd() + " ms");
            System.out.println("Method Get: number of repeat - " + NumberIteration + ", " + Array.TestMethodGet() + " ms");
            System.out.println("Method Remove: number of repeat - " + NumberIteration + ", " + Array.TestMethodRemove() + " ms");

            Linked.SetCountIteration(NumberIteration);

            System.out.println("Results Linked test: ");

            System.out.println("Method Add: number of repeat - " + NumberIteration + ", " + Linked.TestMethodAdd() + " ms");
            System.out.println("Method Get: number of repeat - " + NumberIteration + ", " + Linked.TestMethodGet() + " ms");
            System.out.println("Method Remove: number of repeat - " + NumberIteration + ", " + Linked.TestMethodRemove() + " ms");

            System.out.print("Enter 'e' for exit or 'w' for continue\n");
            do {
                stopLitera = text.nextLine();
            } while (stopLitera.equals(""));
        } while (!stopLitera.equals("e"));
        System.out.print("Program finished");
    }
    /** The function for read number of iterations
     * @param text entered data
     */
    public static int InputNumberIteration(Scanner text) {

        String EnterNumber;
        int StringSymbols;
            do{
                StringSymbols = 0;
                EnterNumber = text.nextLine();
                do{
                    System.out.println("Number of iteration can not be negative or zero. Enter number: ");
                    EnterNumber = text.nextLine();
                }while(Integer.valueOf(EnterNumber) <= 0);

                for(int index = 0; index < EnterNumber.length(); index++) {
                    if (EnterNumber.charAt(index) < '0' || EnterNumber.charAt(index) > '9')
                        StringSymbols++;
                }
                if(StringSymbols>0)System.out.println("Incorrect string data! Enter number of iteration: ");
            } while(StringSymbols > 0);

            return Integer.valueOf(EnterNumber);
        }
}


