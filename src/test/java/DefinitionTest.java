import java.time.LocalDateTime;

import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

	@Rule
	public ClearRule clearRule = new ClearRule();

	@Test
	public void Definition_instantiatesCorrectly_true() {
		Definition testDefinition = new Definition("The coolest person and hottest season");
		assertEquals(true, testDefinition instanceof Definition);
	}

	@Test
	public void Definition_getCorrectDefinition() {
		Definition testDefinition = new Definition("The coolest person and hottest season");
		assertEquals("The coolest person and hottest season", testDefinition.getDefinition());
	}

	@Test
	public void Definition_returnsId_true() {
		Definition testDefinition = new Definition("The coolest person and hottest season");
		assertTrue(Definition.all().size() == testDefinition.getId());
	}
}
