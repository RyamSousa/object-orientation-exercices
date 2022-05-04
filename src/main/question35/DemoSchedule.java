package main.question35;

public class DemoSchedule {
    public static void main(String[] args) {
        Schedule mySchedule = new Schedule(5);

        mySchedule.setSchedule(1, 1, 2022, "Dentista", 0);
        mySchedule.setSchedule(1, 1, 2022, "Mercado", 1);
        mySchedule.setSchedule(5, 2, 2022, "Dentista", 2);
        mySchedule.setSchedule(5, 2, 2022, "Dentista", 3);
        mySchedule.setSchedule(2, 2, 2022, "Dentista", 4);

        System.out.println(mySchedule.listDay(1,1, 2022));

    }
}
