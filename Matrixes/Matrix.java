package org.suai.laba3.Matrixes;
//package org.suai.laba3.Matrixes;
//import org.suai.laba3.MyExceptions.MyException;
import org.suai.laba3.MyExeptions.MyException;
import java.util.Arrays;
//
//
//public class Matrix {
//    protected int[][] mtx;
//    protected int matrixRowSize;
//    protected int matrixCloumnSize;
//
//    public Matrix(int matrixLowSize1, int matrixCloumnSize1){
//        if(matrixLowSize1 <= 0 || matrixCloumnSize1 <= 0)
//        {
//            throw new MyException("Matrix shouldn't equals 0!");
//        }
//        matrixRowSize = matrixLowSize1;
//        matrixCloumnSize = matrixCloumnSize1;
//        mtx = new int[matrixRowSize][matrixCloumnSize];
//        for(int i = 0; i < matrixRowSize; i++)
//        {
//            for(int j = 0; j < matrixCloumnSize; j++)
//            {
//                mtx[i][j] = 0;
//            }
//        }
////        this.matrixRowSize = matrixLowSize1;
////        this.matrixCloumnSize = matrixCloumnSize1;
////        this.mtx = new int[matrixRowSize][matrixCloumnSize];
//    }
//
//    public void setElement(int row, int column, int value) {
//        if(row > this.matrixRowSize || column > this.matrixCloumnSize || row < 0 || column < 0)
//        {
//            throw new MyException("This position not found!");
//        }
//        this.mtx[row][column] = value;
//    }
//
//    public int getElement(int row, int column) {
//        if(row > this.matrixRowSize || column > this.matrixCloumnSize || row < 0 || column < 0)
//        {
//            throw new MyException("This position not found!");
//        }
//        return this.mtx[row][column];
//    }
//
//    public Matrix product(Matrix mtx1) {
//        if(mtx1 == null)
//        {
//            throw new MyException("Input matrix is a null parametr! ");
//        }
//        if (this.matrixCloumnSize != mtx1.matrixRowSize) {
//            throw new MyException("Amount of columns first matrix now equal amount of rows!");
//        }
//        Matrix result = new Matrix(this.matrixRowSize, this.matrixCloumnSize);
//        for (int i = 0; i < this.matrixRowSize; i++) {
//            for (int j = 0; j < this.matrixCloumnSize; j++) {
//                result.mtx[i][j] = 0;
//                for (int k = 0; k < matrixCloumnSize; k++) {
//                    result.mtx[i][j] += mtx[i][k] * mtx1.mtx[k][j];//this.getElement(i, k) * mtx1.getElement(k, i);
//                }
//            }
//        }
//        return result;
//    }
//
//    public Matrix sum(Matrix mtx1) {
//        if(mtx1 == null){
//            throw new MyException("Input matrix is a null parametr! ");
//        }
//        if(this.matrixRowSize != mtx1.matrixRowSize || this.matrixCloumnSize != mtx1.matrixRowSize)
//        {
//            throw new MyException("Matrix sizes are not equals! ");
//
//        }
//        Matrix result = new Matrix(this.matrixRowSize, this.matrixCloumnSize);
//        for (int i = 0; i < this.matrixRowSize; i++) {
//            for (int j = 0; j < this.matrixCloumnSize; j++) {
//                this.mtx[i][j] += mtx1.mtx[i][j];//this.getElement(i,j) + mtx1.getElement(i, j);
//            }
//        }
//        result = this;
//        return result;
//    }
//
//    public final String toString() {
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < this.matrixRowSize; i++) {
//            for(int j = 0; j < this.matrixCloumnSize; j++) {
//                if(j == 0)
//                    if(j == 0 && this.matrixCloumnSize == 1)
//                    {
//                        sb.append("[" + mtx[i][j] + "]").append(" ");
//                    }
//                    else {
//                        sb.append("[" + mtx[i][j] + ",").append(" ");
//                    }
//                else if(j == this.matrixCloumnSize - 1)
//                    sb.append(mtx[i][j] + "]").append(" ");
//                else
//                    sb.append(mtx[i][j] + ",").append(" ");
//            }
//            sb.append('\n');
//        }
//        return sb.toString();
//    }
//    public boolean equals(Matrix mtx1) {
//        return this.matrixRowSize == mtx1.matrixRowSize & this.matrixCloumnSize == mtx1.matrixCloumnSize & Arrays.deepEquals(this.mtx, mtx1.mtx);
//    }
//}
//
//
//
//
//
////    public String toString() {
////        StringBuilder mtxString = new StringBuilder();
////        for (int i = 0; i < matrixLowSize; i++) {
////            mtxString.append(this.matrixArray.get(i).toString()).append("\n");
////
////        }
////        return mtxString.toString();
////    }
//
////
////public class Matrix {
////    protected int rows;
////    protected int columns;
////    protected final int[][] data;
////
////
////    public Matrix(int row, int col) {
////
////        this.rows = row;
////        this.columns = col;
////        this.data = new int [row][col];
////    }
////
////
////    public String toString() {
////        StringBuilder sb = new StringBuilder();
////        for (int i = 0; i < this.rows; i++) {
////            for (int j = 0; j < this.columns; j++)
////                sb.append(this.getElement(i, j)).append("\t\t");
////            sb.append("\n");
////        }
////        return sb.toString();
////    }
////
////    public Matrix product(Matrix m) {
////        if(m == null)
////            throw new MyException("Input matrix is a null parameter");
////        if(this.columns != m.rows)
////            throw  new MyException("Amount of columns first matrix not equal amount of rows!");
////
////        Matrix res = new Matrix(this.rows, m.columns);
////        for (int i = 0; i < this.rows; i++) {
////            for (int j = 0; j < m.columns; j++) {
////                for (int k = 0; k < this.columns; k++)
////                    res.data[i][j] += this.getElement(i, k) * m.getElement(k, j);
////            }
////        }
////        return res;
////    }
////
////    public Matrix sum(Matrix m) {
////        if(m == null)
////            throw new MyException("Input matrix is a null parameter");
////
////        if(this.rows != m.rows | this.columns != m.columns) {
////            throw new MyException("Matrix sizes are not equals!");
////        }
////
////        Matrix res = new Matrix(this.rows, this.columns);
////        for (int i = 0; i < this.data.length; i++)
////            for (int j = 0; j < this.columns; j++)
////                res.data[i][j] = this.getElement(i, j) + m.getElement(i, j);
////        return res;
////    }
////
////    public void setElement(int row, int col, int value) {
////        if (row > this.rows | col > this.columns | row < 0 | col < 0)
////            throw new MyException("This position not found!");
////
////        this.data[row][col] = value;
////    }
////
////    public int getElement(int row, int col) {
////        if (row > this.rows | col > this.columns | row < 0 | col < 0)
////            throw new MyException("This position not found!");
////
////        return this.data[row][col];
////    }
////
////
////    public final boolean equals(Matrix m){
////        return this.rows == m.rows & this.columns == m.columns & Arrays.deepEquals(this.data, m.data);
////    }
//
////}






public class Matrix {
    protected int row;
    protected int column;
    protected int[][] mtx;

    // Matrix(){}

    public Matrix(int row, int column) {
        if ( row < 0 | column < 0) {
            throw  new MyException("Matrix size must be greater than 0");
        }
        this.row = row;
        this.column = column;
        mtx = new int[row][column];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                mtx[i][j] = 0;
            }
        }
    }

    public Matrix sum(Matrix m) {
        if ( this.row != m.row & this.column != m.column) {
            throw  new MyException("Matrix sizes are different!");
        }
        Matrix res = new Matrix(this.row, this.column);
        for(int i = 0; i < this.row; i++) {
            for(int j = 0; j < this.column; j++)
                res.setElement(i, j,(m.getElement(i, j)  + this.getElement(i, j)));
        }
        return res;
    }

    public Matrix product(Matrix m) {
        if (this.column != m.row ) {
            MyException e = new MyException ( "The number of columns of the first matrix is not equal to the number of rows of the second matrix!");
            throw e;
        }
        Matrix prod = new Matrix(this.row,m.column);
        for(int i = 0; i < this.row; i++) {
            for(int j = 0; j < m.column; j++) {
                for(int k = 0; k < this.column; k++) {
                    prod.setElement(i, j, (prod.getElement(i, j) + (this.getElement(i, k) * m.getElement(k, j))));
                }
            }
        }
        return prod;
    }

    public  void setElement(int row, int column, int value){
        if (row > this.row | column > this.column | row < 0 | column < 0 ) {
            MyException e = new MyException("Incorrect index!");
            throw e;
        }
        this.mtx[row][column] = value;
    }

    public  int getElement(int row, int column){
        if (row > this.row | column > this.column | row < 0 | column < 0 ) {
            MyException e = new MyException("Incorrect index!");
            throw e;
        }
        return this.mtx[row][column];
    }

//    public final String toString(){
//        StringBuilder arr = new StringBuilder();
//        for(int i = 0; i < this.row; i++){
//            arr.append('\n');
//            for(int j = 0; j < this.column; j++){
//                arr.append(this.getElement(i, j) + "\t");
//
//
//            }
//            arr.append('\n');
//        }
//        return arr.toString();
//    }
    public final String toString(){
        StringBuilder arr = new StringBuilder();
        for(int i = 0; i < this.row; i++){
            arr.append('\n');
            for(int j = 0; j < this.column; j++){
                if(j == 0) {
                    arr.append(this.getElement(i, j) + "\t");
                }
                else
                    arr.append(this.getElement(i, j)  + "\t");
            }
            arr.append('\n');
        }
        return arr.toString();
    }

    public final boolean equals(Matrix m) {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                if (this.row == m.row && this.column == m.column && this.mtx[i][j] == m.mtx[i][j])
                    return true;
            }
        }
        return false;
    }



}
