package de.inovex.academy.csd.templateengine;

import static org.junit.Assert.*;

import java.util.HashMap;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class TemplateEngineTest {

	@Test
	public void test() {
		TemplateEngine tmpl = new TemplateEngine("hallo");
		assertThat(tmpl.render(new HashMap<String, String>()), is("hallo"));
	}

}
