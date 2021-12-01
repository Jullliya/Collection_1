package molod.yuliya.project;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import molod.yuliya.project.TestMethods;

/**
 * Class Main
 * @author Molod Yuliya
 * @version 1.0
 */
public class Main {

    /** The main function with the execution of class methods
     * @param args string[] args*/
    public void main (String[] args){

        Scanner text = new Scanner(System.in);
        int CountIteration;

        ArrayList<Integer> Array = new ArrayList<Integer>();
        LinkedList<Integer> Linked = new LinkedList<Integer>();

        System.out.println("Введите число итераций: ");

        TestMethods.ArrayTestMethod(Array, 2000);
        TestMethods.LinkedTestMethod(Linked, 2000);

        System.out.println("Array: ");
        for (int index = 0; index <= 2000; index++) {
            Array.get(index);
        }
        System.out.println("Linked: ");
        for (int index = 0; index <= 2000; index++) {
            Linked.get(index);
        }

        for (int index = 0; index <= 2000; index++) {
            Array.remove(index);
        }

        for (int index = 0; index <= 2000; index++) {
            Linked.remove(index);
        }
    }
}
