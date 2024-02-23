
import java.util.ArrayList;

public class ExerciseManagement {

    private ArrayList<Exercise> tests;

    public ExerciseManagement() {
        this.tests = new ArrayList<>();

    }

    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for (Exercise exercise : tests) {
            list.add(exercise.getName());
        }
        return list;
    }

    public void add(String test) {
        tests.add(new Exercise(test));
    }

    public void markAsCompleted(String test) {

        for (Exercise exercise : tests) {
            if (exercise.getName().equals(test)) {
                {
                    exercise.setCompleted(true);
                }

            }
        }

    }

    public boolean isCompleted(String test) {

        for (Exercise exercise : tests) {
            if (exercise.getName().equals(test)) {
                return exercise.isCompleted();

            }
        }
        return false;
    }

}
