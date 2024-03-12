package day26_static.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup { // StudensGroup HAS A Student , HasRelation
    public String groupName;
    public int groupId;
    public ArrayList<Student> students = new ArrayList<>();

    public StudentsGroup(String groupName, int groupId) {// creates the StudentGroup object by setting the groupName and groupId
        this.groupName = groupName;
        this.groupId = groupId;
        //students = new ArrayList<>();// size : 0
    }

    public void addStudent(Student student) {
        students.add(student);

    }// Takes one student object, and adds it to the arrayList of students

    public void addStudent(String name, int age, char gender, String id) {
        students.add(new Student(name, age, gender, id));

        //        Student student = new Student(name, id, age, gender);
        //        students.add(student);
        //        instead of like this


    }// Takes name, age, gender, id of student info, creates student object by using the given info,
    //then adds the created student object to the arrayList of students

    public void addStudent(Student[] students){
        this.students.addAll(Arrays.asList(students));
    } // Takes one array of students, and adds the array of students to the arraylist of students

    public void removeStudent(String id) {
        students.removeIf(p -> p.id.equals(id));

    }// Takes the id and then removes the student object with the specified id from arraylIst of studens

    @Override
    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId='" + groupId + '\'' +
                ", total number of students=" + students.size() +
                '}';
    }
}
