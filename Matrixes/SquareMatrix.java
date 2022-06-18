package org.suai.laba3.Matrixes;
import org.suai.laba3.Matrixes.Matrix;

import org.suai.laba3.Matrixes.Matrix;
import org.suai.laba3.MyExeptions.MyException;

public class SquareMatrix extends Matrix {

    public SquareMatrix(int matrixLowSize1, int matrixCloumnSize1) {
        super(matrixLowSize1, matrixCloumnSize1);
        this.row = matrixLowSize1;
        this.column = matrixCloumnSize1;
        mtx = new int[row][column];
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < column; j++)
            {
                if(i != j) {
                    mtx[i][j] = 0;
                }
                else {
                    mtx[i][j] = 1;
                }
            }
        }
    }
    @Override
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
    
}

