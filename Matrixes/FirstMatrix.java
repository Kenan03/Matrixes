package org.suai.laba3.Matrixes;
import org.suai.laba3.Matrixes.SquareMatrix;


import org.suai.laba3.MyExeptions.MyException;

//public class FirstMatrix extends Matrix {
//    public FirstMatrix(int matrixLowSize1, int matrixCloumnSize1) {
//        super(matrixLowSize1, 1);
//
////        super.rows = matrixLowSize1;
////        super.columns = matrixCloumnSize1;
//        this.column = matrixCloumnSize1;
//        this.row = matrixLowSize1;
//        //mtx = new int[matrixRowSize][matrixCloumnSize];
//
//    }
//    @Override
//    public void setElement(int row, int column, int value) {
//        if (row > this.row || column > 1 || row < 0 || column < 0) {
//            throw new MyException("This position not found!");
//        }
//        mtx[row][column] = value;
//        for (int i = 0; i < row; i++) {
//            for (int j = 1; j < column; j++) {
//                mtx[i][j] = mtx[i][j - 1] + 1;
//            }
//        }
//    }
//    @Override
//    public int getElement(int row, int column) {
//        if (row > this.row || column > this.column || row < 0 || column < 0) {
//            throw new MyException("This position not found!");
//        }
//        return this.mtx[row][column];
//    }
//}
//}
//
//
//
//
//
//
//
//
//
//
//
//
////    @Override
////    public Matrix sum(Matrix mtx1) {
////        Matrix result = new Matrix(this.matrixRowSize, this.matrixCloumnSize);
////        for (int i = 0; i < this.matrixRowSize; i++) {
////            for (int j = 0; j < this.matrixCloumnSize; j++) {
////                this.setElement(i, j, mtx1.getElement(i, j));//= mtx1.mtx[i][j];
////            }
////        }
////        return result;
////    }
////@Override
////public Matrix sum(Matrix mtx1) {
////    Matrix result = new Matrix(this.matrixRowSize, this.matrixCloumnSize);
////    for (int i = 0; i < this.matrixRowSize; i++) {
////        for (int j = 0; j < this.matrixCloumnSize; j++) {
////            this.mtx[i][j] += mtx1.mtx[i][j];
////        }
////    }
////    return result;
////}



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
   // @Override
    /*public Matrix sum(Matrix m) {
        if ( this.row != m.row && this.column != m.column) {
            throw  new MyException("Matrix sizes are different!");
        }
        Matrix res = new Matrix(this.row, this.column);
        for(int i = 0; i < this.row; i++) {
            for(int j = 0; j < this.column; j++)
                res.setElement(i, j, (m.getElement(i, j) + this.getElement(i, j)));
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
                for(int k = 0; k < this.column; k++)
                    prod.setElement(i, j, (prod.getElement(i, j) + (this.getElement(i, k) * m.getElement(k, j))));
            }
        }
        return prod;
    }*/
//    @Override
//    public Matrix sum(Matrix m) {
//        if ( this.row != m.row & this.column != m.column) {
//            throw  new MyException("Matrix sizes are different!");
//        }
//        for(int i = 0; i < this.row; i++) {
//            for(int j = 0; j < this.column; j++)
//                this.setElement(i, j,(m.getElement(i, j)  + this.getElement(i, j)));
//        }
//        return this;
//    }


//public void setElement(int row, int column, int value) {
//        if (row > this.row || column > 1 || row < 0 || column < 0) {
//            throw new MyException("This position not found!");
//        }
//        mtx[row][column] = value;
//        for (int i = 0; i < row; i++) {
//            for (int j = 1; j < column; j++) {
//                mtx[i][j] = mtx[i][j - 1] + 1;
//            }
//        }
//    }
