import java.util.ArrayList;

public class ToDoList {
    private ArrayList<String> tasks;
    private ArrayList<Boolean> completed;
    public static int totalTasksCompleted = 0;

    public ToDoList() {
        tasks = new ArrayList<>();
        completed = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        completed.add(false);
    }

    public boolean markCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            completed.set(index, true);
            totalTasksCompleted++;
            return true;
        }
        return false;
    }

    public boolean isCompleted(int index) { return completed.get(index); }
    public int getTaskCount() { return tasks.size(); }
}
