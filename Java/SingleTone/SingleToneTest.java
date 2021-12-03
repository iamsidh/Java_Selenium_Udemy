package SingleTone;

public class SingleToneTest {

    private static SingleToneTest instance = new SingleToneTest();

    private  SingleToneTest(){

        System.out.println("Creating SingleTone Object");
    }

    public static SingleToneTest SingleToneInstance(){

        return instance;

    }
}
