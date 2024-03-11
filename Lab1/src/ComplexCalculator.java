import java.util.Scanner;

public class ComplexCalculator{

    static class ComplexNumber{
        int realPart = 0;
        int imaginaryPart = 0;
    }

    public static void main(String[] args) {
        // creating the numbers and the scanner in order to read from console
        ComplexNumber no1 = new ComplexNumber();
        ComplexNumber no2 = new ComplexNumber();
        ComplexNumber finalNo = new ComplexNumber();
        Scanner scanner = new Scanner(System.in);

        //displaying the text and reading the numbers
        System.out.println("Enter the first complex number:");

        System.out.println("Real part:");
        no1.realPart = scanner.nextInt();
        System.out.println("Imaginary part:");
        no1.imaginaryPart = scanner.nextInt();
        System.out.println(no1.realPart + " + " + no1.imaginaryPart+'i');

        System.out.println("Enter the second complex number:");
        System.out.println("Real part:");
        no2.realPart = scanner.nextInt();
        System.out.println("Imaginary part:");
        no2.imaginaryPart = scanner.nextInt();
        System.out.println(no2.realPart + " + " + no2.imaginaryPart+'i');

        // choosing the operation
        System.out.println("Choose the desired operation:");
        System.out.println("1 - Addition");
        System.out.println("2 - Substation");
        System.out.println("3 - Multiplication");
        int choice = scanner.nextInt();

        // based on choice make the operation
        switch (choice){
            case 1:
                finalNo.realPart = no1.realPart + no2.realPart;
                finalNo.imaginaryPart = no1.imaginaryPart + no2.imaginaryPart;
                break;
            case 2:
                finalNo.realPart = no1.realPart - no2.realPart;
                finalNo.imaginaryPart = no1.imaginaryPart - no2.imaginaryPart;
                break;
            case 3:
                finalNo.realPart = no1.realPart*no2.realPart - no1.imaginaryPart*no2.imaginaryPart;
                finalNo.imaginaryPart = no1.realPart*no2.imaginaryPart + no1.imaginaryPart*no2.realPart;
                break;
        }

        // displays the result
        System.out.println("Result of operation:");
        System.out.println(finalNo.realPart + " + " + finalNo.imaginaryPart + 'i');
    }
}
