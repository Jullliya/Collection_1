package molod.yuliya.project;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestMethods {

    private
    private long WorkTime;

    public TestMethods() {this.WorkTime = 0;}

    public long ArrayTestMethod(ArrayList<Collection> Array, int CountRepeat){
        long startTime = System.nanoTime();
        for (int index = 0; index <= CountRepeat; index++) {
                Array.add(new Collection(index));
            }
        long endTime = System.nanoTime();
        WorkTime = endTime-startTime;
        return WorkTime;
    }

    public long LinkedTestMethod(LinkedList<Collection> Linked, int CountRepeat){
        long startTime = System.nanoTime();
        for (int index = 0; index <= CountRepeat; index++) {
            Linked.add(new Collection(index));
        }
        long endTime = System.nanoTime();
        return WorkTime;
    }
}
