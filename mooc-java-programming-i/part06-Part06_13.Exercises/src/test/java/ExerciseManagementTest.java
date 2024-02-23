
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class ExerciseManagementTest {

    private ExerciseManagement management;

    @Before
    public void initialize() {
        management = new ExerciseManagement();
    }

    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, management.exerciseList().size());
    }

    @Test
    public void exerciseListGrowsListByOne() {

        management.add("First Test");
        assertEquals(1, management.exerciseList().size());

    }

    @Test
    public void addedExerciseIsInList() {

        management.add("First Test");
        assertTrue(management.exerciseList().contains("First Test"));

    }
    
     @Test
    public void exerciseCanBeMarkedAsCompleted() {
        management.add("new exercise");
        management.markAsCompleted("new exercise");
        assertTrue(management.isCompleted("new exercise"));

    }
}
