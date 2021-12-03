package SingleTone;

public class Test {

    public static void main(String[] args) {

        SingleToneTest test =SingleToneTest.SingleToneInstance();
        SingleToneTest test2 =SingleToneTest.SingleToneInstance();

       // SingleToneTest test3 = new SingleToneTest();

        System.out.println(test.hashCode()==test2.hashCode());
    }
}
