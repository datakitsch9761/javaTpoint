package java_static_keyword;

//it was possible til JDK 1.6. Since JDK 1.7, it is not possible to execute a Java class without the main method

class A3 {
    static{
        System.out.println("static block is invoked");
        System.exit(0);
    }
}
