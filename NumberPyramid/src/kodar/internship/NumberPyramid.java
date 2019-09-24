package kodar.internship;


public class NumberPyramid {
    private static final int rows = 9;
    private int columns = 17;
    public void createPyramid () {
        for (int i = rows;i > 0; i--) {
                printNumbers(i, columns);
        }
    }

    private  void printNumbers (int row,int column){
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
