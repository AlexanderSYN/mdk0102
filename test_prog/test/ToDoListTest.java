import org.junit.jupiter.api.*;

public class ToDoListTest {

    ToDoList tdl;


//    @BeforeEach
//    public void makeEmptyToDoListAndAddOneTask() {
//        tdl = new ToDoList();
//        System.out.println("добавление задачи");
//        tdl.addTask("купить молока");
//    }

    @BeforeAll
    public static void initTotalTasks() {
        ToDoList.totalTasksCompleted = 0;
    }

    @BeforeEach
    public void makeToDoListAndAddTwoTaskAndMarkedThem() {
        tdl = new ToDoList();
        System.out.println("добавление задач");
        tdl.addTask("Купить хлеб");
        tdl.addTask("Сделать уроки");

        tdl.markCompleted(0);
    }

//    @Test
//    @DisplayName("Тест: проверка, что в спике только одна задача")
//    public void shouldGetOneTask() {
//        int countTasks = tdl.getTaskCount();
//        int expectedTasks = 1;
//        System.out.println("проверка, что в спике только одна задача");
//        Assertions.assertEquals(expectedTasks, countTasks);
//    }
    @Test
    public void shouldGetTrueForOneTaskAndFalseForTwo() {
        System.out.println("проверка на выполнение задач");
        Assertions.assertTrue(tdl.isCompleted(0));
        Assertions.assertFalse(tdl.isCompleted(1));
    }

    @AfterAll
    public static void outputCountTasksCompleted() {
        System.out.println("всего выполнено задач: " + ToDoList.totalTasksCompleted);
    }
}
