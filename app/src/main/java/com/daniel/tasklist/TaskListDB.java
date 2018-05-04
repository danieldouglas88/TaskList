package com.daniel.tasklist;

public class TaskListDB {
    //db constants
    public static final String DB_NAME = "tasklist.db";
    public static final int DB_VERSION = 1;

    //list table constants
    public static final String LIST_TABLE = "list";

    public static final String LIST_ID = "_id";
    public static final int LIST_ID_COL = 0;

    public static final String LIST_NAME = "list_name";
    public static final int LIST_NAME_COL = 1;

    //task table constants
    public static final String TASK_TABLE = "task";

    public static final String TASK_ID = "_id";
    public static final int TASK_ID_COL = 0;

    public static final String TASK_LIST_ID = "list_id";
    public static final int TASK_LIST_ID_COL = 1;

    public static final String TASK_NAME = "task_name";
    public static final int TASK_NAME_COL = 2;

    public static final String TASK_NOTES = "notes";
    public static final int TASK_NOTES_COL = 3;

    public static final String TASK_COMPLETED = "date_completed";
    public static final int TASK_COMPLETED_COL = 4;

    public static final String TASK_HIDDEN = "hidden";
    public static final int TASK_HIDDEN_COL = 5;

    //create and drop table


    public static final String CREATE_LIST_TABLE = "CREATE TABLE" + LIST_TABLE + " ( " + LIST_ID +
            "INTEGER PRIMARY KEY AUTOINCREMENT, " + LIST_NAME + "TEXT   NOT NULL UNIQUE;";

    
}
