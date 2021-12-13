package molod.yuliya.project;

/**
 * A class that evaluates the value of an expression.
 */
public class Subdivision {
    /**
     * Integer field containing unique user number.
     */
    int id;

    /**
     * String field containing username.
     */
    String name;

    /**
     * Constructor of the Subdivision class
     * @param Id unique user number
     * @param Name username
     */
    public Subdivision(int Id, String Name) {
        this.id = Id;
        this.name = Name;
    }

    /**
     * Method for getting a unique user number
     */
    public int divGetId() { return id; }

    /**
     * Method for getting username
     */
    public String divGetName() { return name; }
}

