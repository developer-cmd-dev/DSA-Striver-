package BasicMath;

import java.util.*;

public class PrintAllDivisors {

    static void main() {

        int x = 36;

        optimised(x);

    }

    public static void optimised(int x){

        for (int i=1;i<=Math.sqrt(x);i++){

            if((x%i)==0){
                System.out.println(i);
                if((x/i)!=i){
                    System.out.println(i);
                }
            }


        }

    }
}
