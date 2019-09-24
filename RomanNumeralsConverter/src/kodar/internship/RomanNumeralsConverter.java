package kodar.internship;

public class RomanNumeralsConverter {
    public void convertNumber(int number){
        int testNum = number;
        while(testNum>=1000){
            System.out.print("M");
            testNum = testNum - 1000;
        }
        while (testNum>=900){
            System.out.print("CM");
            testNum= testNum-900;
        }
        while (testNum>=500){
            System.out.print("D");
            testNum = testNum-500;
        }
        while (testNum>=400){
            System.out.print("CD");
            testNum = testNum-400;
        }
        while (testNum>=100){
            System.out.print("C");
            testNum = testNum-100;
        }
        while (testNum>=90){
            System.out.print("XC");
            testNum = testNum-90;
        }
        while (testNum>=50){
            System.out.print("L");
            testNum = testNum-50;
        }
        while (testNum>=40){
            System.out.print("XL");
            testNum = testNum-40;
        }
        while (testNum>=10){
            System.out.print("X");
            testNum = testNum-10;
        }
        while (testNum>=9){
            System.out.print("IX");
            testNum = testNum-9;
        }
        while (testNum>=5){
            System.out.print("V");
            testNum = testNum-5;
        }
        while (testNum>=4){
            System.out.print("IV");
            testNum = testNum-4;
        }
        while (testNum>=1){
            System.out.print("I");
            testNum = testNum-1;
        }
        System.out.println();

    }
}
