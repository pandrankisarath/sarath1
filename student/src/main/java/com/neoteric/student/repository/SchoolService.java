package com.neoteric.student.repository;

public class SchoolService {


    private static int teachercount=20;
    // private static int schoolservice;
    public SchoolService(){
        System.out.println("From counting in School Teachers: "+teachercount);

    }
    public int getTeachercount(){
        return teachercount;

    }
    public int getadd(){
        return teachercount=teachercount+1;
    }
    public int getremove(){
        return teachercount=teachercount-1;
    }
    /*public static int getschoolService(){

        if (schoolservice == null){
            schoolservice=schoolService.schoolservice;
            return schoolservice;

        }else{
            return schoolservice;
        }
    }*/
}