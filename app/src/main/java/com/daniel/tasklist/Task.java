package com.daniel.tasklist;

public class Task {

    private long taskid;
    private long listid;
    private String name;
    private String notes;
    private String completedDate;
    private String hidden;

    public static final String TRUE = "1";
    public static final String FALSE = "0";

    public Task(){
        name = "";
        notes = "";
        completedDate = FALSE;
        hidden = FALSE;
    }

    public Task(int listid, String name, String notes, String completedDate, String hidden){
        this.listid = listid;
        this.name = name;
        this.notes = notes;
        this.completedDate = completedDate;
    }

    public Task(long taskid, long listid, String name, String notes, String completedDate, String hidden) {
        this.taskid = taskid;
        this.listid = listid;
        this.name = name;
        this.notes = notes;
        this.completedDate = completedDate;
        this.hidden = hidden;
    }

    public long getTaskid() {
        return taskid;
    }

    public void setTaskid(long taskid) {
        this.taskid = taskid;
    }

    public long getListid() {
        return listid;
    }

    public void setListid(long listid) {
        this.listid = listid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(String completedDate) {
        this.completedDate = completedDate;
    }

    public String getHidden() {
        return hidden;
    }

    public void setHidden(String hidden) {
        this.hidden = hidden;
    }

    public long getCompletedDateMills(){
        return Long.parseLong(completedDate);
    }

    public void setCompletedDateMills(long mills){
    this.completedDate = Long.toString(mills);
    }



}

