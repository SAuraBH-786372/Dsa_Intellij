import java.util.ArrayList;

public class LetterCombination {
    public static void main(String[] args) {

    }
    static int[] combinations(String num){
        char[] two={'a','b','c'};
        char[] three={'d','e','f'};
        char[] four={'g','h','i'};
        char[] five={'j','k','l'};
        char[] six={'m','n','o'};
        char[] seven={'p','q','r','s'};
        char[] eight={'t','u','v'};
        char[] nine={'w','x','y','z'};
        ArrayList<String> ar=new ArrayList<>();
        char num1=num.charAt(0);
        char num2=num.charAt(1);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if(num1=='2' && num2=='3'){
                    ar.add(two[i]+three[j]);
                }

            }
        }.
        return null;
    }
}
