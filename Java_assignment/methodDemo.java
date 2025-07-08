public class MethodDemo {
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    public void nonstaticmethod(){
        System.out.println("This is a non static method.");
    }

    public static void main(String[] args){
        MethodDemo.staticMethod();

        MethodDemo obj = new MethodDemo();
        obj.nonstaticmethod();
    }

}