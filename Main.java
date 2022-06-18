package org.suai.laba3;

import com.sun.source.util.SourcePositions;
import jdk.swing.interop.SwingInterOpUtils;
import org.suai.laba3.Matrixes.FirstMatrix;
import org.suai.laba3.MyExeptions.MyException;
import org.suai.laba3.Matrixes.Matrix;
import org.suai.laba3.Matrixes.SquareMatrix;

public class Main {

    public static void main(String[] args) {
       try {
//           Matrix r = new Matrix(3,1);
//           System.out.println(r.toString());
//         FirstMatrix a = new FirstMatrix(2, 2);
//		   Matrix b = new Matrix(2,2);
//		   a.setElement(0, 0, 1);
//         a.setElement(1, 0, 2);
//         System.out.println(a.toString());
//		   b.setElement(1, 0, 4);
//		   System.out.println(b.toString());
//		   System.out.println(b.sum(a));
//		   FirstMatrix r = new FirstMatrix(5, 5);
//		   r.setElement(1,0,5);
//		   System.out.println(r.toString());
//		   System.out.println(r.getElement(1,4));

//           FirstMatrix w = new FirstMatrix(3,3);
//           w.setElement(0,0,2);
//           w.setElement(1,0,2);
//           w.setElement(2,0,2);
//           //System.out.println(w.getElement(4,4));
//           System.out.println(w.toString());
//           FirstMatrix e = new FirstMatrix(3,3);
//           e.setElement(0,0,3);
//           System.out.println(e.toString());
//           System.out.println(e.product(e));
//           FirstMatrix r = new FirstMatrix(3,3);
//           System.out.println(r.toString());




//             FirstMatrix i = new FirstMatrix(3,3);
//             i.setElement(0,0,2);
//             i.setElement(1,0,3);
//             //i.setElement(2,0,4);
//             System.out.println(i);
           //System.out.println(i.getElement(2, 2));
//             FirstMatrix y  = new FirstMatrix(5, 5);
//             y.setElement(0,0,6);
//             y.setElement(1,0,7);
//             y.setElement(2,0,8);
//             System.out.println(y);
//             System.out.println("Result after sum:\n" + y.sum(y));
//             System.out.println("Result after product:\n" + y.product(i));
	        //SquareMatrix r = new SquareMatrix(3, 3);
	        //System.out.println(r);
	         //System.out.println(r.sum(y));

//           Matrix a = new Matrix(3,3);
//           a.setElement(0,0,2);
//           a.setElement(0,1,2);
//           a.setElement(0,2,2);
//           a.setElement(1,0,2);
//           a.setElement(1,1,2);
//           a.setElement(1,2,2);
//           a.setElement(2,0,2);
//           a.setElement(2,1,2);
//           a.setElement(2,2,2);
//           System.out.println(a.toString());
//           SquareMatrix r = new SquareMatrix(3,3);
//           r.setElement(1,1, 5);
//           System.out.println(r.toString());
//           System.out.println("RESULT SUM: " + a.sum(r));
//           System.out.println("RESULT PRODUCT: " + a.product(r));

           FirstMatrix e = new FirstMatrix(4,4);
           System.out.println(e.toString());
           FirstMatrix r = new FirstMatrix(3,3);
           r.setElement(1,0,4);
           System.out.println(r.toString());
           System.out.println(r.sum(e));



}
       catch (MyException e)
       {
           System.out.println(e.getErrorMessage());
       }




	// try {
	// 	SquareMatrix r = new SquareMatrix(2, 3);
	// 	Matrix b = new Matrix(3, 2);
	// 	r.setElement(0,0,3);
	// 	r.setElement(0,1,1);
	// 	r.setElement(1,0,2);
	// 	r.setElement(1,1,4);
	// 	r.setElement(0,2,5);
	// 	r.setElement(1,2,6);
	// 	System.out.println(r.toString());
	// 	b.setElement(0,0,1);
	// 	b.setElement(0,1,2);
	// 	b.setElement(1,0,3);
	// 	b.setElement(1,1,4);
	// 	b.setElement(2,0,5);
	// 	b.setElement(2,1,6);
	//     System.out.println(b.toString());
	// 	System.out.println(b.product(r));
	//     System.out.println("----------");
	//     Matrix w = new Matrix(2, 2);
	//     w.setElement(0, 0, 2);
	//     w.setElement(0, 1, 2);
	//     w.setElement(1, 0, 3);
	//     w.setElement(1, 1, 3);
	//     SquareMatrix e = new SquareMatrix(2, 2);
	//     e.setElement(0,0,9);
	//     e.setElement(0,1,9);
	//     e.setElement(1,0,9);
	//     e.setElement(1,1,9);
	//     System.out.println(w.toString());
	//     System.out.println(e.toString());
	//     System.out.println(w.product(e));
 //    }
 //    catch (MyException e) {
 //        System.out.println(e.getErrorMessage());
 //    }



//        Matrix a = new Matrix(3, 2);
//        SquareMatrix b = new SquareMatrix(2, 2);
//        a.setElement(0,0, 12);
//        a.setElement(0,1, 11);
//        a.setElement(1,0, 10);
//        a.setElement(1,1, 9);
//        a.setElement(2, 0, 8);
//        a.setElement(2, 1, 7);
//        b.setElement(0,0, 9);
//        b.setElement(0,1, 10);
//        b.setElement(1,0, 11);
//        b.setElement(1,1, 12);
//        System.out.println(a.toString());
//        System.out.println(b.toString());
//        try {
//            a.product(a);
//        }
//        catch (MyException e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println(a.product(b));
//        System.out.println(b.sum(b));
    }
}
