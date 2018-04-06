package ru.mephi.onlineplatform.entities;

import java.util.List;

/**
 * @author Stanislav_Semichevskiy
 */
public class Teacher extends User {

    private String bio;

    private List<Course> courses;

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
