package molod.yuliya.project;

import java.util.LinkedList;

/**
 * Class Array test for test LinkedList methods
 */
public class LinkedTest {

    private long BeginTime;
    private long EndTime;
    private long WorkTime;
    private LinkedList<Integer> Linked = new LinkedList<>();
    private int CountLinkedOperation;

    public LinkedTest(){}

    /** The function set
     * @param EnterCount repeat method
     */
    public void SetCountIteration (int EnterCount) {
        CountLinkedOperation = EnterCount;
    }

    /** The function set
     * @param LinkedElement add number for LinkedList element
     */
    public void SetArray (int LinkedElement) {
        Linked.add(LinkedElement);
    }

    /** The function get
     * @param LinkedElement the last element of LinkedList
     */
    public int GetArray (int LinkedElement) {
        return Linked.get(Linked.size()-1);
    }

    /** The function get the number iterations of work methods
     */
    public int GetNumberIteration () {
        return CountLinkedOperation;
    }

    /** The function set
     * @param Number iterations for work methods
     */
    public void SetNumberIteration (int Number) {
        CountLinkedOperation = Number;
    }

    /** The function get size of LinkedList
     */
    public int Size () {
        return Linked.size();
    }

    /** The function test method add for LinkedList
     */
    public long TestMethodAdd() {

        BeginTime = System.nanoTime();
        for (int index = 0; index < CountLinkedOperation; index++) Linked.add(index);
        EndTime = System.nanoTime();
        WorkTime = (EndTime - BeginTime);
        return WorkTime;
    }

    /** The function test method get for LinkedList
     */
    public long TestMethodGet() {

        BeginTime = System.nanoTime();
        for (int index = 0; index < CountLinkedOperation; index++) Linked.get(index);
        EndTime = System.nanoTime();
        WorkTime = (EndTime - BeginTime);
        return WorkTime;
    }
    /** The function test method remove for LinkedList
     */
    public long TestMethodRemove() {

        for (int index = 0; index < CountLinkedOperation; index++) Linked.add(index);
        BeginTime = System.nanoTime();
        for (int index = 0; index < CountLinkedOperation; index++) Linked.remove(index);
        EndTime = System.nanoTime();
        WorkTime = (EndTime - BeginTime);
        return WorkTime;
    }
}
