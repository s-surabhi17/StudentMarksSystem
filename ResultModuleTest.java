import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ResultModuleTest {

    @Test
    public void testCalculateGrade_APlus() {
        ResultModule rm = new ResultModule();
        assertEquals("A+", rm.calculateGrade(95.0));
    }

    @Test
    public void testCalculateGrade_A() {
        ResultModule rm = new ResultModule();
        assertEquals("A", rm.calculateGrade(80.0));
    }

    @Test
    public void testCalculateGrade_B() {
        ResultModule rm = new ResultModule();
        assertEquals("B", rm.calculateGrade(65.0));
    }

    @Test
    public void testCalculateGrade_C() {
        ResultModule rm = new ResultModule();
        assertEquals("C", rm.calculateGrade(50.0));
    }

    @Test
    public void testCalculateGrade_Fail() {
        ResultModule rm = new ResultModule();
        assertEquals("Fail", rm.calculateGrade(40.0));
    }

    @Test
    public void testAverageMarksCalculation() {
        MarksModule m = new MarksModule(80, 90, 100);
        assertEquals(90.0, m.averageMarks(), 0.01);
    }

    @Test
    public void testTotalMarks() {
        MarksModule m = new MarksModule(70, 80, 90);
        assertEquals(240, m.totalMarks());
    }
}
