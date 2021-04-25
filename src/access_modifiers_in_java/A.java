package access_modifiers_in_java;

class A extends A01 {
    public static void main(String[] args) {
        A obj = new A();
        obj.msg();
    }
}

class A01{
    protected void msg(){
        System.out.println("Hello");
    }
}
