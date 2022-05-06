package main.question33;

public class AcademicRecord {
    public static int registrationsNumber = 0;
    private String name;
    private int registration;
    private int courseCode;
    private double chargePercentage;

    public void initializeRecord(String name, int courseCode, double chargePercentage){
        registrationsNumber++;
        this.name = name;
        this.registration = registrationsNumber;
        this.courseCode = courseCode;
        this.chargePercentage = chargePercentage;
    }

    public double calcMonthlyPayment(){
        return 100*courseCode*chargePercentage;
    }

    public static void setRegistrationsNumber(int value){
        registrationsNumber = value;
    }

    public static  int getRegistrationsNumber(){
        return registrationsNumber;
    }

    public String getName(){
        return name;
    }
}
