package org.example.week3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class DataStructures {
    private List<TaskItem> tasks = new ArrayList<>();

    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1, "Push lab code to the github", Status.TO_DO),
                new TaskItem(2, "Prepare for the quiz", Status.IN_PROGRESS),
                new TaskItem(3, "Go over tasks from lab2", Status.COMPLETED));
    }

    // TODO 1
    public void getAllObjects() {
        for (TaskItem item : tasks) {
            System.out.println(item.taskId + ", " + item.taskDescription + ", " + item.status);
        }
    }
    // TODO 2

    public List<TaskItem> getByStatus(Status status) {
        List<TaskItem> getbyStatus = new ArrayList<>();

        for (TaskItem item : tasks) {
            if (item.status == status) {

                getbyStatus.add(item);
            }
        }
        return getbyStatus;
    }

    // TODO 3

    public List<TaskItem> idParameter() {
        List<TaskItem> idParameter = new ArrayList<>();
        for (TaskItem item : tasks) {
            if (item.taskId >= 2) {
                idParameter.add(item);
            }
        }
        return idParameter;
    }

    // TODO 4

    public void descriptionOfEachTask() {
        tasks.stream().forEach(task -> {System.out.println(task.taskDescription);});

    }

    public static void main(String[] args) {
        DataStructures ds = new DataStructures();

        ds.getAllObjects();

        List<TaskItem> todo2 = ds.getByStatus(Status.COMPLETED);
        for (TaskItem ti : todo2) {
            System.out.println(ti.taskId + ", " + ti.taskDescription + ", " + ti.status);
        }

        List<TaskItem> todo3 = ds.idParameter();
        for (TaskItem ti : todo3) {
            System.out.println(ti.taskId + ", " + ti.taskDescription + ", " + ti.status);
        }

        ds.descriptionOfEachTask();
    }

}