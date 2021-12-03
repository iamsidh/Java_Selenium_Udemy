package assignments;

public class  ConstructorOverloading

{
    static class abc{


        public abc(){

            System.out.println("default constrcuor");
        }

        public abc(int a){

            System.out.println("pamaterrized");

        }

        public static void main(String[] args) {

    abc a = new abc(7);

        }

    }



}
