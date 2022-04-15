import static org.junit.Assert.*;

public class DodawanieAppTest {

    @org.junit.Test
    public void added() {
        DodawanieApp dod=new DodawanieApp();
        assertEquals(10,dod.added(8,2));
    }
}