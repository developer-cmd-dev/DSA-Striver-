public class BasicMath {
    static void main() {
//        extractionOfNumber();
//        CountDigits();
        reverseNumber();
    }

    public static void extractionOfNumber(){
        int number = 456789;
        while (number>0){
            int extractedNumber = number%10;
            System.out.println(extractedNumber);
            number = number/10;
        }
    }

    public static void CountDigits(){
        int number = 456789;
        int count = 0;
        while (number>0){
            count++;
            number = number/10;
        }

        System.out.println(count);
    }

    public static void reverseNumber(){

        int number = 145000;
        int reverseNumber =0;
        while (number>0){
            int extractedNumber = number%10;
            reverseNumber= (reverseNumber*10)+extractedNumber;
            number = number/10;
        }

        System.out.println(reverseNumber);

    }
}
