import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestingMeanSimple.class, TestingModeSimple.class, TestingRangeSimple.class, testMeanOfZeroInts.class })

public class AllTests {

}
