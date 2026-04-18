public class BasicMath {
    static void main() {
        System.out.println("This is Basic math");
//        extractionOfNumber();
        CountDigits();
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
            int extractedNumber = number%10;
            count++;
            number = number/10;
        }

        System.out.println(count);
    }
}
