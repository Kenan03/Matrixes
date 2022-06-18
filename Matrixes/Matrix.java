package org.suai.laba3.Matrixes;
//package org.suai.laba3.Matrixes;
//import org.suai.laba3.MyExceptions.MyException;
import org.suai.laba3.MyExeptions.MyException;
import java.util.Arrays;

public class Matrix {
    protected int row;
    protected int column;
    protected int[][] mtx;

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
