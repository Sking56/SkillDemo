import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void multiplyTest(){
        assertEquals(4, SkillDemo.multiply(2, 2));
    }
}
