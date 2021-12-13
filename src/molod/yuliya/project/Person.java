package molod.yuliya.project;

/**
 * A class that containing persons data: id, name, sex, date, div, salary.
 */
public class Person {
    /**
     * String field containing unique person number.
     */
    String id;
    /**
     * String field containing person name.
     */
    String name;
    /**
     * String field containing person sex.
     */
    String sex;
    /**
     * String field containing person date.
     */
    String date;
    /**
     * Subdivision field containing fields subdivision class.
     */
    Subdivision div;
    /**
     * String field containing person salary.
     */
    String salary;

    /**
     * Constructor of the Person class
     * @param Id unique person number
     * @param Name person name
     * @param Sex person sex
     * @param Date date of person birthday
     * @param Salary person salary
     * @param Division fields Subdivision class
     */
    public Person(String Id, String Name, String Sex, String Date, String Salary, Subdivision Division){
        this.id = Id;
        this.name = Name;
        this.sex = Sex;
        this.date = Date;
        this.salary = Salary;
        this.div = Division;
    }

    //public Person(String id, String name, String sex, String date, String s, Division division) { }

    /**
    * Method for passing data to a class Person field id
     */
    public void setId(String Id) { id = Id; }
    /**
     * Method for getting a unique person number
     */
    public String getId() { return id; }
    /**
     * Method for passing data to a class Person field name
     */
    public void setName(String Name) { name = Name; }
    /**
     * Method for getting a unique person name
     */
    public String getName(){ return name; }
    /**
     * Method for passing data to a class Person field sex
     */
    public void setSex(String Sex) { sex = Sex; }
    /**
     * Method for getting a unique person sex
     */
    public String getSex() { return sex; }
    /**
     * Method for passing data to a class Person field div
     */
    public void setName(Subdivision Div) { div = Div; }
    /**
     * Method for getting data from class Person
     */
    public Subdivision getDiv() { return div; }
    /**
     * Method for passing data to a class Person field salary
     */
    public void setSalary(String Salary) { salary = Salary; }
    /**
     * Method for getting a person salary
     */
    public String getSalary() { return salary; }
    /**
     * Method for passing data to a class Person field date
     */
    public void setDate(String Date) { date = Date; }
    /**
     * Method for getting a person date
     */
    public String getDate() { return this.date; }
}
