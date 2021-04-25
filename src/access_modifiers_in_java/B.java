package access_modifiers_in_java;

class B {
    public static void main(String[] args) {
    A02 obj = new A02();
    obj.msg();
    }
}

class A02{
    void msg(){
        System.out.println("Hello");
    }
}