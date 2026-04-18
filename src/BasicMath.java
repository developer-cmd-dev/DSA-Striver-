public class BasicMath {
    static void main() {
        System.out.println("This is Basic math");
        extractionOfNumber();
    }

    public static void extractionOfNumber(){
        int number = 456789;
        while (number>0){
            int extractedNumber = number%10;
            System.out.println(extractedNumber);
            number = number/10;
        }
    }
}
