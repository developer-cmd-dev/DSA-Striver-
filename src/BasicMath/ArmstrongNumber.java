package BasicMath;

public class ArmstrongNumber {
    static void main() {
    int x = 7789;
    int dup = x;
    int sum = 0;

    while (x>0){
        int ld = x%10;
         sum = sum + (ld*ld*ld);
         x = x/10;
    }

        System.out.println(dup == sum);
    }
}
