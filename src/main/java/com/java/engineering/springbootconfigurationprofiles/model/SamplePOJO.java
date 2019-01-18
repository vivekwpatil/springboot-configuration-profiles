package com.java.engineering.springbootconfigurationprofiles.model;

public class SamplePOJO {

    private String userId;
    private String id;
    private String title;
    private String body;

    public String getBody() {
        return body;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
