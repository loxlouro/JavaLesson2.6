package attendance;

import java.util.ArrayList;
import java.util.List;

public class AttendanceService {
   public static ArrayList<Day> studing = new ArrayList<>();

   public static void AttendanceService(){
       for (int i =0; i<7;i++){
           Day temp = new Day();
           studing.add(temp);
       }
   }

   public static void setRandomLessons(){
       studing.get(1).lessons.add(new Lesson(SubjectNames.MATHS,lessonTimes.FIRST));
       studing.get(1).lessons.get(0).sitStudentIn(GroupList.allGroups.get(0).Students.get(0));
       studing.get(1).lessons.add(new Lesson(SubjectNames.ENGLISH,lessonTimes.SECOND));
       studing.get(1).lessons.get(1).sitStudentIn(GroupList.allGroups.get(1).Students.get(1));
       studing.get(1).lessons.add(new Lesson(SubjectNames.PROGRAMMING,lessonTimes.THIRD));

       studing.get(2).lessons.add(new Lesson(SubjectNames.ENGLISH,lessonTimes.FIRST));
       studing.get(2).lessons.add(new Lesson(SubjectNames.PHISICS,lessonTimes.SECOND));
       studing.get(2).lessons.get(1).sitStudentIn(GroupList.allGroups.get(1).Students.get(1));
       studing.get(2).lessons.add(new Lesson(SubjectNames.PROGRAMMING,lessonTimes.THIRD));

       studing.get(3).lessons.add(new Lesson(SubjectNames.PHISICS,lessonTimes.FIRST));
       studing.get(3).lessons.get(0).sitStudentIn(GroupList.allGroups.get(1).Students.get(1));
       studing.get(3).lessons.add(new Lesson(SubjectNames.ENGLISH,lessonTimes.SECOND));
       studing.get(3).lessons.add(new Lesson(SubjectNames.MATHS,lessonTimes.THIRD));

       studing.get(4).lessons.add(new Lesson(SubjectNames.MATHS,lessonTimes.FIRST));
       studing.get(4).lessons.add(new Lesson(SubjectNames.ENGLISH,lessonTimes.SECOND));
       studing.get(4).lessons.get(1).sitStudentIn(GroupList.allGroups.get(1).Students.get(0));
       studing.get(4).lessons.add(new Lesson(SubjectNames.PROGRAMMING,lessonTimes.THIRD));

       studing.get(5).lessons.add(new Lesson(SubjectNames.MATHS,lessonTimes.FIRST));
       studing.get(5).lessons.add(new Lesson(SubjectNames.PHISICS,lessonTimes.SECOND));
       studing.get(5).lessons.add(new Lesson(SubjectNames.ENGLISH,lessonTimes.THIRD));

       GroupList.allLessons = studing;
   }

}
