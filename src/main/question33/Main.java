package main.question33;

public class Main {
    public static void main(String[] args) {
        AcademicRecord student1 = new AcademicRecord();
        AcademicRecord student2 = new AcademicRecord();
        AcademicRecord student3 = new AcademicRecord();

        System.out.println("Atributo estático: "+ AcademicRecord.getRegistrationsNumber());
        student1.initializeRecord("Alguem", 456, 200.0);
        System.out.println("A mensalidade de "+  student1.getName() + " é "+ student1.calcMonthlyPayment());
        System.out.println("Atributo estático: "+ AcademicRecord.getRegistrationsNumber());
        student2.initializeRecord("Aqui", 888, 150.0);
        System.out.println("A mensalidade de "+  student2.getName() + " é "+ student2.calcMonthlyPayment());
        System.out.println("Atributo estático: "+ AcademicRecord.getRegistrationsNumber());
        student3.initializeRecord("Aqui", 888, 150.0);
        System.out.println("A mensalidade de "+  student3.getName() + " é "+ student3.calcMonthlyPayment());
        System.out.println("Atributo estático: "+ AcademicRecord.getRegistrationsNumber());
    }
}
