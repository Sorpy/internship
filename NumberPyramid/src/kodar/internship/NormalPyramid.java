package kodar.internship;

import java.util.Scanner;

public class NormalPyramid {
    int spaceCounter = 0;
    private int currentRow;
    private int rows;
    public void createPyramid () {
        System.out.println("Enter number of rows");
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        if (rows > 9) {
            System.out.println("Invalid number of rows");
            rows = 0;
            createPyramid();
        }
        int columns = (rows * 2) - 1;
        currentRow = rows;
        printPyramid(rows,columns,currentRow,true);


    }
    private void printPyramid(int rows, int column, int row,boolean firstSpace){
        if(row == 0) System.exit(0);
        column =(rows *2)-1;
        while(rows > row){
            System.out.print("   ");
            row++;
            column = column-2;
        }
        if (!firstSpace){
            spaceCounter = 0;
            firstSpace =true;
            System.out.println();
            currentRow--;
            printPyramid(rows, column, currentRow,firstSpace);
        }
        else {
            printNumbers(column,1,false);
            printPyramid(rows, column, currentRow,firstSpace);
        }
    }


    private void printNumbers(int column,int counter,boolean isDescending) {
        int middleColumn = (column / 2) + 1;
        System.out.print(" " + counter + " ");
        if (counter < middleColumn && !isDescending) {
            counter++;
            printNumbers(column, counter,false);
        } else if (counter > 1) {
            counter--;
            printNumbers(column, counter,true);
        } else if (counter == 1){
            int row = rows-spaceCounter;
            printPyramid(rows,column,row,false);
        }
    }
}
