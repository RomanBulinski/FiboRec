import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testNormalMethor(){
        Integer[] result = {0,1,1,2,3,5};
        Integer[] mainresult = Main.fibStream(5).toArray(new Integer[5]);
        assertArrayEquals( result , mainresult);

    }


    @Test
    public void testfibREC(){
        assertEquals( 8 , Main.fibREC(6));
    }


}
