package org.suai.laba3.Matrixes;
import org.suai.laba3.Matrixes.SquareMatrix;


import org.suai.laba3.MyExeptions.MyException;

public class FirstMatrix extends Matrix {

    public FirstMatrix(int row, int column) {
        super(row, 1);
        if (row < 0 | column < 0) {
            throw new MyException("Matrix size must be greater than 0");
        }
        this.row = row;
        this.column = column;
    }

    @Override
    public int getElement(int row, int column) {
        if (row > this.row | column > this.column | row < 0 | column < 0) {
            MyException e = new MyException("Incorrect index!");
            throw e;
        }
        return this.mtx[row][0] + column;
    }

    @Override
    public void setElement(int row, int column, int value) {
        if (row > this.row | column > this.column | row < 0 | column < 0) {
            MyException e = new MyException("Incorrect index!");
            throw e;
        }
            this.mtx[row][0] = value;

    }
}
