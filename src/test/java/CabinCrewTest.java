import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {
    CabinCrew cabinCrew;

    @Before
    public void before(){
        cabinCrew = new CabinCrew("Jane", CabinCrewType.PURSER);
    }

    @Test
    public void hasName(){
        assertEquals("Jane", cabinCrew.getName());
    }

    @Test
    public void hasType(){
        assertEquals(CabinCrewType.PURSER, cabinCrew.getCabinCrewType());
    }
}
