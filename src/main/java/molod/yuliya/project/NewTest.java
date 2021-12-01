package molod.yuliya.project;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Class Test for test ArrayList and LinkedList methods
 */
public class NewTest {

    private ArrayTest Array = new ArrayTest();
    private LinkedTest Linked = new LinkedTest();

    @Test
    public void TestAddForArray() {
        Array.SetNumberIteration(1000);
        Array.TestMethodAdd();
        assertEquals(Array.GetNumberIteration(), Array.Size());
        assertEquals(999, Array.GetArray(999));
    }

    @Test
    public void TestAddForLinked() {
        Linked.SetNumberIteration(1000);
        Linked.TestMethodAdd();
        assertEquals(Linked.GetNumberIteration(), Linked.Size());
        assertEquals(999, Linked.GetArray(999));
    }

    @Test
    public void TestGetForArray() {
        Array.SetNumberIteration(2);
        Array.TestMethodAdd();
        Array.TestMethodGet();
        assertEquals(1, Array.GetArray(1));
    }

    @Test
    public void TestGetForLinked() {
        Linked.SetNumberIteration(2);
        Linked.TestMethodAdd();
        Linked.TestMethodGet();
        assertEquals(1, Linked.GetArray(1));
    }

    @Test
    public void TestRemoveForArray() {
        Array.TestMethodRemove();
        assertEquals(0, Array.Size());
    }

    @Test
    public void TestRemoveForLinked() {
        Linked.TestMethodRemove();
        assertEquals(0, Linked.Size());
    }

}
