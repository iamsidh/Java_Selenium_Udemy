package assignments.interview;

public class ShiftAll0 {


    public static void main(String[] args) {

        int [] array = {1,2,0,3,4,5,0,7,0,78,0,4,};

        int count = 0;

        for(int i = 0 ; i< array.length;i++){

            if(array[i]!=0){

                array[count++]=array[i];

            }

            while (count< array.length){

                array[count++]=0;
            }
            for(int j = 0; i< array.length;j++){

                System.out.print(array[j]+" ,");
            }
        }



    }
}
