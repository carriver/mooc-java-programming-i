
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ExerciseManagementTest {

    @Test
    public void exerciseListEmptyAtBeginning() {
        ExerciseManagement management = new ExerciseManagement();
        assertEquals(0, management.exerciseList().size());
    }

    @Test
    public void addingExerciseGrowsListByOne() {
        ExerciseManagement management = new ExerciseManagement();
        management.add("Write a test ");
        assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void addedExerciseIsInList() {
        ExerciseManagement management = new ExerciseManagement();
        management.add("Write a test");
        assertTrue(management.exerciseList().contains("Write a test"));

    }

}
