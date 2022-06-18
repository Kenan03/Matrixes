package org.suai.laba3.MyExeptions;
//package org.suai.laba3.MyException;
public class MyException extends RuntimeException {
    private String ErrorMessage;

    public MyException(String ErrorString){
        this.ErrorMessage = ErrorString;
    }

    public String getErrorMessage(){
        return ErrorMessage;
    }

}
