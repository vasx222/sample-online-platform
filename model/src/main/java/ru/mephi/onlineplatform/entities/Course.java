package ru.mephi.onlineplatform.entities;

import java.util.Date;
import java.util.List;

public class Course {

    private Long id;
    private String name;
    private String description;
    private String picture;
    private Date createAt;
    private User createdByUser;
    private List<CourseTopic> topics;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public User getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(User createdByUser) {
        this.createdByUser = createdByUser;
    }

    public List<CourseTopic> getTopics() {
        return topics;
    }

    public void setTopics(List<CourseTopic> topics) {
        this.topics = topics;
    }
}
