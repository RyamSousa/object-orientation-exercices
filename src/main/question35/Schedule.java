package main.question35;

import java.util.Arrays;

public class Schedule {

    EntryInSchedule[] schedules;

    public Schedule(int length) {
        this.schedules = new EntryInSchedule[length];
    }

    public String listDay(int day, int month, int year){
        for(int i = 0; i < schedules.length; i++) {
           if( schedules[i].isInTheDay(day, month, year)){
               return schedules[i].toString();
            }
        }
        return "Dia não encontrado";
    }

    public void setSchedule(int day, int month, int year, String subject, int index){
        schedules[index] = new EntryInSchedule(day, month, year, subject);
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "schedules=" + Arrays.toString(schedules) +
                '}';
    }
}
