package java_encapsulation;
// use Setter & Getter methods to set and get the data in it

//Setter of getter method, you can make the class read-only or write only
//

public class Student {
    //private data member
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
