package method_overriding;

//Test class to create objects and call the methods
public class Test02 {
    public static void main(String[] args) {
    SBI s = new SBI();
    ICICI i = new ICICI();
    AXIS a = new AXIS();
        System.out.println("SBI Rate Of Interest " + s.getRateOfInterest() + "%");
        System.out.println("ICICI Rate Of Interest " + i.getRateOfInterest() + "%");
        System.out.println("AXIS Rate Of Interest " + a.getRateOfInterest() + "%");
    }
}

//Creating a parent class
class Bank{
    int getRateOfInterest(){
        return 0;
    }
}

//Creating children classes
class SBI extends Bank{
    @Override
    int getRateOfInterest() {
        return 8;
    }
}

class ICICI extends Bank{
    @Override
    int getRateOfInterest() {
        return 7;
    }
}

class AXIS extends Bank{
    @Override
    int getRateOfInterest() {
        return 9;
    }
}