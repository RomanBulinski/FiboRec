import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MainTest {

    @Test
    public void testNormalMethor(){

        Integer[] result = {0,1,1,2,3,5};
        Integer[] mainresult = Main.fibStream(5).toArray(new Integer[5]);
        assertArrayEquals( result , mainresult);

    }



}
