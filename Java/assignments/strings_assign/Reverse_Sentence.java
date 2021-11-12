package assignments.strings_assign;


public class Reverse_Sentence {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String String="i am xtream wete";
        char[] ch = String.toCharArray();
        String result="";
        for (int i = ch.length-1; i >=0; i--){
            int k=i;
            while (i>=0&&ch[i]!=' '){
                i--;
            }
            int j=i+1;
            while (j<=k){
                result=result+ch[j];
                j++;
            }
            result=result+" ";
        }
        System.out.println(result);
    }

}