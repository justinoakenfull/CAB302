package Person;

public class Person {
    private String name;

    public Person()
    {

    }

    public Person(String name)
    {
        setName(name);
    }

    public void setName(String name)
    {
        if(name.isEmpty())
        {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
}
