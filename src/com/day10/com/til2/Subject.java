package com.day10.com.til2;

import java.util.List;

public class Subject {
    private String subjectName;
    private Teacher teacher;
    private List<Student> students;

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }




    public String show(){
        String str="课程名称:"+this.getSubjectName()+"\n"+
                "授课老师:"+this.getTeacher().getName()+
                "\n"+this.getStudents().get(0).getAttendance()+":"+
                this.getStudents().get(0).getName()+
                "\n"+this.getStudents().get(1).getAttendance()+":"+
                this.getStudents().get(1).getName()+
                "\n"+this.getStudents().get(2).getAttendance()+":"+
                this.getStudents().get(2).getName();
       return str;
    }
}
