import attendance.*;

import java.util.Scanner;

public class MainController {
    Scanner theScanner = new Scanner(System.in);
    public void mainMenu(){
        System.out.println("Welcome!\nChoose action you want to do:\n1)Show students\n2)Show lessons\n3)Show Attendance");
        int choose=theScanner.nextByte();
        switch (choose){
            case 1:
                AttendanceView.showLessons(AttendanceService.studing);
            case 2:
                AttendanceView.showStudents(GroupList.allGroups.get(1));
            case 3:
                AttendanceView.showAttendance(AttendanceService.studing,GroupList.allGroups.get(1));
        }

    }


}
