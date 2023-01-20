package attendance;

import java.util.ArrayList;

public class Day {
    private DayOfWeek DayOfWeek;
    public ArrayList<Lesson> lessons=new ArrayList<>();
    private static int week=1;

    public Day(){
        switch (week){
            case 1:this.DayOfWeek = attendance.DayOfWeek.MONDAY;break;
            case 2:this.DayOfWeek = attendance.DayOfWeek.TUESDAY;break;
            case 3:this.DayOfWeek = attendance.DayOfWeek.WEDNESDAY;break;
            case 4:this.DayOfWeek = attendance.DayOfWeek.THURSDAY;break;
            case 5:this.DayOfWeek = attendance.DayOfWeek.FRIDAY;break;
            case 6:this.DayOfWeek = attendance.DayOfWeek.SATURDAY;break;
            case 7:this.DayOfWeek = attendance.DayOfWeek.SUNDAY;
        }
        week++;

    }
    public String toString(){
        StringBuilder temp = new StringBuilder(this.DayOfWeek.toString());
        for (int i=0;i<lessons.size();i++){
            temp.append(this.lessons);
        }
        return temp.toString();
    }
    public Day(attendance.DayOfWeek dayOfWeek, ArrayList<Lesson> lessons) {
        DayOfWeek = dayOfWeek;
        this.lessons = lessons;
    }

    public Day(attendance.DayOfWeek dayOfWeek) {
        DayOfWeek = dayOfWeek;
    }
}

enum DayOfWeek{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

