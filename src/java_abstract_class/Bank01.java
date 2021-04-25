package java_abstract_class;

abstract class Bank01 {
    abstract int getRateOfInterest();
}

class SBI01 extends Bank01{
    int getRateOfInterest(){return 7;}
}

class PNB01 extends Bank01{
    int getRateOfInterest(){return 8;}
}

class TestBank{
    public static void main(String[] args) {
        Bank01 obj1 = new SBI01();
        System.out.println("Rate of Interest is : " + obj1.getRateOfInterest() + "%");

        Bank01 obj2 = new PNB01();
        System.out.println("Rate of Interest is : " + obj2.getRateOfInterest() + "%");
    }
}
