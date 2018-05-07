package com.daniel.tasklist;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class TaskListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);

        //get DB object and StringBuilder
        TaskListDB db = new TaskListDB(this);
        StringBuilder sb = new StringBuilder();

        //insert a task
        Task task = new Task(1, "Make dentist appt", "", "0", "0");
        long insertId = db.insertTask(task);
        if(insertId>0){
            sb.append("Row inserted. Insert id: " + insertId + "\n");
        }

        Task task2 = new Task(1, "Take car for oil change", "", "0", "0");
        long insertId2 = db.insertTask(task);
        if(insertId2>0){
            sb.append("Row inserted. Insert id: " + insertId + "\n");
        }

        //update task
        task.setTaskid((int) insertId);
        task.setName("UPDATE TEST");
        int updateCount = db.updateTask(task);
        if(updateCount == 1){
            sb.append("Task updated. Update count: " + updateCount + "\n");
        }

        //delete task

        //delete old tasks

        //display all tasks by id and name
        ArrayList<Task> tasks = db.getTasks("Personal");
        for (Task t : tasks){
            sb.append(t.getTaskid() + " | " + t.getName() + "\n");
        }

        //display string on the UI
        TextView taskListTextView = (TextView) findViewById(R.id.taskListTextView);
        taskListTextView.setText(sb.toString());

    }
}
