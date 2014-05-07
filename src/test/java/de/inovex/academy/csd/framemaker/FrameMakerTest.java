package de.inovex.academy.csd.framemaker;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FrameMakerTest {
	private FrameMaker fm = new FrameMaker();

	@Test
	public void testFrameSimple() {
		List<String> frame = fm.makeFrame(Arrays.asList("x"));
		assertNotNull(frame);

		assertEquals(3, frame.size());
		assertThat(frame, equalTo(Arrays.asList("***", "*x*", "***")));
	}
	
	@Test
	public void testFrameComplex() {
		List<String> frame = fm.makeFrame(Arrays.asList("Hallo", "schoene, neue", "Welt"));
		assertNotNull(frame);
		
		assertEquals(5, frame.size());
		assertThat(frame, equalTo(Arrays.asList(
				"***************", 
				"*Hallo        *", 
				"*schoene, neue*",
				"*Welt         *",
				"***************")));
	}
}
