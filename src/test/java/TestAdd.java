import org.junit.Assert;
import org.junit.Test;

/**
 * Created by home on 9/29/15.
 */
public class TestAdd {
    @Test
    public void testAdd(){
        Add add = new Add();
        Assert.assertEquals(10, add.add(5,5));
    }

    @Test
    public void testAdd1(){
        Add add = new Add();
        Assert.assertEquals(5, add.add(0, 5));
    }
}
