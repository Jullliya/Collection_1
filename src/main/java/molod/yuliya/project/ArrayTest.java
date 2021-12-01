package molod.yuliya.project;

import java.util.ArrayList;

/**
 * Class Array test for test ArrayList methods
 */
public class ArrayTest {

    private long BeginTime;
    private long EndTime;
    private long WorkTime;
    private ArrayList<Integer> Array = new ArrayList<>();
    private int CountArrayOperation;

    public ArrayTest(){}

    /** The function set
     * @param EnterCount repeat method
     */
    public void SetCountIteration (int EnterCount) {
        CountArrayOperation = EnterCount;
    }

    /** The function set
     * @param ArrayElement add number for ArrayList element
     */
    public void SetArray (int ArrayElement) {
        Array.add(ArrayElement);
    }

    /** The function get
     * @param ArrayElement the last element of ArrayList
     */
    public int GetArray (int ArrayElement) {
        return Array.get(Array.size()-1);
    }

    /** The function get the number iterations of work methods
     */
    public int GetNumberIteration () {
        return CountArrayOperation;
    }

    /** The function set
     * @param Number iterations for work methods
     */
    public void SetNumberIteration (int Number) {
        CountArrayOperation = Number;
    }

    /** The function get size of ArrayList
     */
    public int Size () {
        return Array.size();
    }

    /** The function test method add for ArrayList
     */
    public long TestMethodAdd() {

        BeginTime = System.nanoTime();
        for (int index = 0; index < CountArrayOperation; index++) Array.add(index);
        EndTime = System.nanoTime();
        WorkTime = (EndTime - BeginTime);
        return WorkTime;
    }

    /** The function test method get for ArrayList
     */
    public long TestMethodGet() {

        BeginTime = System.nanoTime();
        for (int index = 0; index < CountArrayOperation; index++) Array.get(index);
        EndTime = System.nanoTime();
        WorkTime = (EndTime - BeginTime);
        return WorkTime;
    }

    /** The function test method remove for ArrayList
     */
    public long TestMethodRemove() {

        for (int index = 0; index < CountArrayOperation; index++) Array.add(index);
        BeginTime = System.nanoTime();
        for (int index = 0; index < CountArrayOperation; index++) Array.remove(index);
        EndTime = System.nanoTime();
        WorkTime = (EndTime - BeginTime);
        return WorkTime;
    }

}
