package org.sopt;

import org.sopt.model.Student;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        final ArrayList<Student> studentArrayList = new ArrayList<>();

        final Student student1 = new Student();
        final Student student2 = new Student();
        final Student student3 = new Student();

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);


        for (final Student s : studentArrayList) {
            System.out.println(s.toString());
        }
    }
}
