package com.example.mycardlist;


public class CourseModel {

     String course_name;
     String course_rating;
     int course_image;

    public CourseModel(String course_name, String course_rating, int course_image) {
        this.course_name = course_name;
        this.course_rating = course_rating;
        this.course_image = course_image;
    }


    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_rating() {
        return course_rating;
    }

    public void setCourse_rating(String course_rating) {
        this.course_rating = course_rating;
    }

    public int getCourse_image() {
        return course_image;
    }

    public void setCourse_image(int course_image) {
        this.course_image = course_image;
    }
}