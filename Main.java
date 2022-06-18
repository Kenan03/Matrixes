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

    }
}
