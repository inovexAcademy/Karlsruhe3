/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.inovex.academy.csd.countandsort;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 *
 * @author Torsten
 */
public class FileParserTest {

	FileParser fileParser = new FileParser();

	@Test
	public void testParse() {
		assertThat(fileParser.parse(asList("Alice")), equalTo(asList("1 Alice")));
		assertThat(fileParser.parse(asList("Bob")), equalTo(asList("1 Bob")));
		assertThat(fileParser.parse(asList("Bob", "Bob")), equalTo(asList("2 Bob")));
		assertThat(fileParser.parse(asList("Mary", "Bob", "Mary", "Alice")),
						equalTo(asList("1 Alice", "1 Bob", "2 Mary")));
	}
}
