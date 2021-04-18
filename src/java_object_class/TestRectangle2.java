package java_object_class;

class TestRectangle2{
    public static void main(String[] args) {
        Rectangle01 r1 = new Rectangle01(), r2 = new Rectangle01();//creating two objects
        r1.insert(11,5);
        r2.insert(3,15);
        r1.calculateArea();
        r2.calculateArea();
    }
}

class Rectangle01 {
    int length;
    int width;
    void insert(int l, int w){
        length = l;
        width = w;
    }
    void calculateArea(){
        System.out.println(length * width);
    }
}
