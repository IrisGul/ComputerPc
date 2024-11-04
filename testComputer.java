import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testComputer
{// zw 1000 und 4000
    @Test
    public void testWenig()
    {
        ComputerPc comp;
        comp=new ComputerPc("hp",true, 500, 200);
        assertEquals(comp.getMhz(),2000);
    }
    @Test
    public void testOk()
    {
        ComputerPc comp2;
        comp2=new ComputerPc("apple", false, 1200, 3000);
        assertEquals(comp2.getMhz(),3000);
    }
    @Test
    public void testViel()
    {
        ComputerPc comp3;
        comp3=new ComputerPc("lenovo", true,1500, 5000);
        assertEquals(comp3.getMhz(),2000);
    }
}
