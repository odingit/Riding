package com.bingo.riding.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table USER.
 */
public class User {

    private String objectId;
    private String userPhoto;
    private String nikeName;
    private Boolean isMale;
    private String message;

    public User() {
    }

    public User(String objectId) {
        this.objectId = objectId;
    }

    public User(String objectId, String userPhoto, String nikeName, Boolean isMale, String message) {
        this.objectId = objectId;
        this.userPhoto = userPhoto;
        this.nikeName = nikeName;
        this.isMale = isMale;
        this.message = message;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }

    public Boolean getIsMale() {
        return isMale;
    }

    public void setIsMale(Boolean isMale) {
        this.isMale = isMale;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
