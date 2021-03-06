package com.cehome.tiebaobei.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "AREA".
 */
public class Area {

    private long id;
    private Integer parentId;
    private String name;
    private String enFirstChar;
    private Integer weight;

    public Area() {
    }

    public Area(long id) {
        this.id = id;
    }

    public Area(long id, Integer parentId, String name, String enFirstChar, Integer weight) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
        this.enFirstChar = enFirstChar;
        this.weight = weight;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnFirstChar() {
        return enFirstChar;
    }

    public void setEnFirstChar(String enFirstChar) {
        this.enFirstChar = enFirstChar;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

}
