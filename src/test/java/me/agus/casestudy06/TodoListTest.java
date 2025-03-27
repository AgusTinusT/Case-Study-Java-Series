package me.agus.casestudy06;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class TodoListTest {

    TodoList todoList = new TodoList();

    @Test
    void testAddTask() {
        todoList.addTask("Buy groceries");
        assertEquals(1, todoList.getAllTasks().size());
        assertTrue(todoList.getAllTasks().contains("Buy groceries"));
    }

    @Test
    void testRemoveTask() {
        todoList.addTask("Walk the dog");
        todoList.removeTask("Walk the dog");
        assertEquals(0, todoList.getAllTasks().size());
        todoList.addTask("Do laundry");
        todoList.removeTask("Clean the house"); // Tugas tidak ada
        assertEquals(1, todoList.getAllTasks().size());
    }

    // Tambahkan test case untuk getTask, getAllTasks, dan findTask di sini
    @Test
    void testGetTask() {
        todoList.addTask("Buy groceries");
        assertEquals("Buy groceries", todoList.getAllTasks().get(0));
    }

    @Test
    void testGetAllTasks() {
        todoList.addTask("Buy groceries");
        todoList.addTask("Walk the dog");
        List<String> allTasks = todoList.getAllTasks();
        assertEquals(2, allTasks.size());
        assertTrue(allTasks.contains("Buy groceries"));
        assertTrue(allTasks.contains("Walk the dog"));
    }

    @Test
    void testFindTask() {
        todoList.addTask("Buy groceries");
        todoList.addTask("Walk the dog");
        assertEquals(0, todoList.findTask("Buy groceries"));
        assertEquals(1, todoList.findTask("Walk the dog"));
    }
}