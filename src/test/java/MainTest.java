import org.example.aspectj.domain.Cat;
import org.example.aspectj.domain.Daisy;
import org.example.aspectj.domain.Dog;
import org.example.aspectj.domain.Kingdom;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainTest {

	private static final Logger log = LoggerFactory.getLogger(MainTest.class);

	@Test
	public void runTest() throws Exception {

	    for (Class<? extends Kingdom> c : new Class[] {Cat.class, Dog.class, Daisy.class}) {
				Kingdom k = c.newInstance();
		    log.info("Name -> " + k.getName());
	    }

	}

}
