package main.question33;

public class DemoAcademicRecord {
    public static void main(String[] args) {
        AcademicRecord student1 = new AcademicRecord();
        AcademicRecord student2 = new AcademicRecord();

        student1.initializeRecord("Alice", 456, 200.0);
        student2.initializeRecord("Carlos", 888, 150.0);

        System.out.println("A mensalidade de "+  student1.getName() + " é "+ student1.calcMonthlyPayment());
        System.out.println("A mensalidade de "+  student2.getName() + " é "+ student2.calcMonthlyPayment());

        System.out.println("Número de matriculados: "+ AcademicRecord.getRegistrationsNumber());
    }
}
