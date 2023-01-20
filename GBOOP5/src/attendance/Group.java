package attendance;

import java.util.ArrayList;

public class Group {
    private int groupId;
    public ArrayList<Student> Students;

    public Group(int id){
        this.groupId=id;
        this.Students = new ArrayList<>();
    }

    public String toString(){
        StringBuilder temp = new StringBuilder("");
        for (int i=0;i<Students.size();i++){
            temp.append(Students.get(i)+"\t");
        }
        return temp.toString();
    }

    public static ArrayList<Student> getStudentsOfGroup(int groupId){
        for (int i=0;i<GroupList.allGroups.size();i++) {
            if (GroupList.allGroups.get(i).groupId == groupId) {

                return GroupList.allGroups.get(i).Students;
            }else return null;
        }
        return null;
    }
}
