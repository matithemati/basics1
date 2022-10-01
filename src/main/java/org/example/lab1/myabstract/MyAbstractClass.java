package org.example.lab1.myabstract;

public abstract class MyAbstractClass {

    protected String myProtectedField;
    protected String myProtectedField2;

    protected void myProtected() {
        System.out.println("myProtectedField = " + myProtectedField);
    }

    protected abstract void myAbstract();

}
