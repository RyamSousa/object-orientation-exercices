package main.question31;

public class ComplexNumber {

    private double partReal;
    private double partImaginary;

    public ComplexNumber(double partReal, double partImaginary){
        this.partReal = partReal;
        this.partImaginary = partImaginary;
    }

    public ComplexNumber(double partReal){
        this.partReal = partReal;
        partImaginary = 0;
    }

    public ComplexNumber(){
        partReal = 0;
        partImaginary = 0;
    }

    @Override
    public String toString() {
        return "ComplexNumber = [" +
                "partReal=" + partReal +
                ", partImaginary=" + partImaginary +
                ']';
    }
}
