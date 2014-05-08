package de.inovex.academy.csd;

import static de.inovex.academy.csd.utils.ExternalProcessMatcher.printsOnStdout;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertThat;
import org.junit.Ignore;

import org.junit.Test;

public class CLITest {
	
	@Test
	@Ignore("Template")
	public void testSimpleCall() {
		assertThat(asList("/tmp/bla.sh"), printsOnStdout("Hello World"));
	}
}
