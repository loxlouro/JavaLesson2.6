import attendance.AttendanceService;
import attendance.Group;
import attendance.GroupList;
import attendance.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Group group1 = new Group(1);
        group1.Students.add(new Student("Oleg","Glecov",21));
        group1.Students.add(new Student("Natasha","Semeniako",22));

        Group group2 = new Group(2);
        group2.Students.add(new Student("Gleb","Barabashka", 19));
        group2.Students.add(new Student("Belg","Galosha",22));

        GroupList.allGroups.add(group1);
        GroupList.allGroups.add(group2);
        AttendanceService.AttendanceService();
        AttendanceService.setRandomLessons();
        MainController main = new MainController();
        main.mainMenu();
    }
}