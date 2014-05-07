package de.inovex.academy.csd.templateengine;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class TemplateEngineTest {

	@Test
	public void testBanal() throws Exception {
		TemplateEngine tmpl = new TemplateEngine("hallo");
		assertThat(tmpl.render(new HashMap<String, String>()), is("hallo"));
	}

	@Test
	public void testWithParameterWithoutErrors() throws Exception {
		TemplateEngine tmpl = new TemplateEngine("hallo ${name}");
		Map<String, String> params = new HashMap<>();
		params.put("name", "Du");

		String rendered = tmpl.render(params);
		// Wert kleiner als Platzhalter
		assertEquals("hallo Du", rendered);

		// Wert groesser als Platzhalter
		params.clear();
		params.put("name", "ein sehr langer Name");
		assertEquals("hallo ein sehr langer Name", tmpl.render(params));
	}
	@Test
	public void testWithParameterWithExpectedError() throws Exception {
		TemplateEngine tmpl = new TemplateEngine("hallo ${name}");
		Map<String, String> params = new HashMap<>();
		params.put("name", "Du");
		params.put("mock", "trollolo");
		try {
			String rendered = tmpl.render(params);
			fail("No Exception thrown but returned:" + rendered);
		} catch (IllegalArgumentException e) {
			assertEquals("Key mock not found", e.getMessage());
		}

	}
	@Test
	public void testWithMissingParameterWithExpectedError() throws Exception {
		TemplateEngine tmpl = new TemplateEngine("hallo ${name} ${flup}");
		Map<String, String> params = new HashMap<>();
		params.put("name", "Du");
		try {
			String rendered = tmpl.render(params);
			fail("No Exception thrown but returned:" + rendered);
		} catch (IllegalArgumentException e) {
			assertEquals("Unmatched variables!", e.getMessage());
		}

	}
}
