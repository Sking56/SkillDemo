import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void multiplyTest(){
        assertEquals(3, SkillDemo.multiply(2, 2));
    }
}
