package com.assignment.task6;

public class Q6 {
    public static void main(String[] args) {
        Complex c1=new Complex(5,6);
        Complex c2=new Complex(3,-5);
        System.out.println("First complex number is "+c1);
        System.out.println("Second complex number is "+c2);
        System.out.println("Addition is "+c1.addition(c2));
        System.out.println("Subtraction is "+c1.subtraction(c2));
        System.out.println("Multiplication is "+c1.multiplication(c2));
    }
}
class Complex{
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        String sign="";
        if(imaginary>0){
            sign="+";
        }
        return "Complex{" + real +sign+ imaginary+"i }";
    }

    public Complex addition(Complex complex){
        Complex addition =new Complex(this.real+complex.getReal(), this.imaginary+complex.imaginary);
        return addition;
    }

    public Complex subtraction(Complex complex){
        return new Complex(this.real-complex.getReal(), this.imaginary-complex.imaginary);
    }
    public Complex multiplication(Complex complex){
        return new Complex((this.real * complex.real) - (this.imaginary * complex.imaginary)
                , (this.real * complex.imaginary) + (this.imaginary * complex.real));
    }
}
