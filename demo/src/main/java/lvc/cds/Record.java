package demo.src.main.java.lvc.cds;

public class Record {
    
    private int age;
    private String name;
    private int id;
    private String DOB;


    public Record(int a, String n)
    {
        age = a;
        name = n;
        id = -1;
    }

    public void setId(int id)
    {
        this.id = id;
    }


    public int getId()
    {
        return id;
    }

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

    public void setDOB(String d){
        DOB = d;

    }
    public String getDOB(){
        return DOB;
    }

    public void print()
    {
        System.out.println("Record ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
