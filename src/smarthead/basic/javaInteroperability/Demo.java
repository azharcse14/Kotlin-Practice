package smarthead.basic.javaInteroperability;

public class Demo {
    public static void main(String[] args) {
        int sum = DemoKt.add(4, 5);
        System.out.println(sum);

    }

    void message(){
        System.out.println("This is from Java");
    }
}

