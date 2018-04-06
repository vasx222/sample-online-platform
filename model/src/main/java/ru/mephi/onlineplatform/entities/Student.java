package ru.mephi.onlineplatform.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stanislav_Semichevskiy
 */
public class Student extends User {

    private List<Course> courses;

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void signToCourse(Course course) {
        if(courses == null) {
            courses = new ArrayList<>();
        }
        this.courses.add(course);
    }
}
