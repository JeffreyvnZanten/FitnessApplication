import java.util.*;
public class User {
    private int age;
    String name;
    List<Exercise> exercises;

    public User() {
        exercises = new ArrayList<Exercise>();
        createDummyList();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    void createDummyList() {
        exercises.add(new WeightLiftingExercise("Squats", 10, 70));
        exercises.add(new WeightLiftingExercise("Deadlift", 10, 60));
        exercises.add(new Exercise("Pullups", 20));
        exercises.add(new WeightLiftingExercise("Bench press", 10, 80));
        exercises.add(new Exercise("Planks", 20));
    }
}