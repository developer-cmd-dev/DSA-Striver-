package BasicMath;

public class ReverseNumber {
    static void main() {
        int number = -123;
        int reverseNumber = 0;

        while (number>0 || number <0){
            int lastDigit = number%10;
            number=number/10;
            reverseNumber = (reverseNumber*10)+lastDigit;
        }
        System.out.println(reverseNumber);
    }
}

