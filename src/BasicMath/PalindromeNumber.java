package BasicMath;

public class PalindromeNumber {
    static void main() {
    int n=121;

    int reversedNumber = 0;
    int copiedN=n;
    while (copiedN>0){
        int lastDigit = copiedN%10;
        copiedN=copiedN/10;
        reversedNumber=(reversedNumber*10)+lastDigit;
    }

        if(reversedNumber==n){
            System.out.println("Number is Palindrome");
        }


    }
}
