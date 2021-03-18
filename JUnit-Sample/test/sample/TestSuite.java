package sample;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Victor Garcia Vera 2DAM
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({sample.VectorsTest.class, sample.UtilsTest.class})
public class TestSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
