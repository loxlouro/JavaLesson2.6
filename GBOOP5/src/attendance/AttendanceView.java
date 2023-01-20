package attendance;

import java.util.ArrayList;

public class AttendanceView {
    public  static void showLessons(ArrayList<Day> studing){
        for (int i=0; i<studing.size();i++){
            System.out.println(studing.get(i).toString());
        }
    }

    public static void showStudents(Group theGroup){

        for (int i=0;i<theGroup.Students.size();i++){

            System.out.println(theGroup.Students.get(i).toString()+"\n");
        }
    }

    public static void showAttendance(ArrayList<Day> studing, Group theGroup){
        double[] temp=new double[]{0.00,0.00,0.00,0.00};
        int[] count=new int[]{0,0,0,0};
        try {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 2; j++) {
                    for (int k = 0; k < 2; k++) {
                        if (studing.get(i).lessons.get(j).getPresentStudents().get(k) == theGroup.Students.get(k)) {
                            count[k]++;
                        }
                    }


                }
            }
        } catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }

        for (int i=0;i<theGroup.Students.size();i++){
            temp[i]=count[i]/15;
            System.out.println(theGroup.Students.get(i)+"\n"+temp[i]);
        }
    }
}
