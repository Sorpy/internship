package kodar.internship;


import java.util.Scanner;

public class NumberPyramid {
    public void createPyramid () {
        System.out.println("Enter number of rows");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        if (rows >9 ){
            System.out.println("Invalid number of rows");
            rows =0;
            createPyramid();
        }
        int columns = (rows*2)-1;
        for (int i = rows;i > 0; i--) {
                printNumbers(rows,i, columns);
        }
    }

    private  void printNumbers (int rows, int row,int column){
        int row2 = row;
        while(rows > row){
            printSpace();
            row++;
            column = column-2;
        }
        printNumber(column);
        while(rows > row2){
            printSpace();
            row2++;
        }
        System.out.println();
    }

    private void printSpace(){
        System.out.print("  ");
    }

    private void printNumber (int column){
        int middleColumn = (column/2) +1;

        int counter = 1;
        while(counter < middleColumn) {
            System.out.print(counter + " ");
                counter ++;
        }
        while(counter >0){
            System.out.print(counter + " ");
            counter--;
        }

    }
}
