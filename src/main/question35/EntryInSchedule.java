package main.question35;

public class EntryInSchedule {
    private int day;
    private int month;
    private int year;
    private String subject;

    EntryInSchedule(int day, int month, int year, String subject){
        this.day = day;
        this.month = month;
        this.year = year;
        this.subject = subject;
    }

    public String toString(){
        return "EntryInSchedule = [day="+ day +", month="+ month+ ", year=" +year+", subject="+ subject + "]";
    }

    public boolean isInTheDay(int day, int month, int year){
        if(this.day == day && this.month == month && this.year == year){
            return true;
        }

        return false;
    }
}
