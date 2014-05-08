/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.inovex.academy.csd.countandsort;

import static java.util.Arrays.asList;
import java.util.List;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 *
 * @author Torsten
 */
public class FileReaderTest {
	FileReader fileReader = new FileReader();
	
	@Test
	public void testRead() throws Exception {
		List<String> lines = fileReader.readFile("src/main/resources/countAndSortInput1.txt");
		assertEquals(6, lines.size());
		assertThat(lines, equalTo(asList("Alice", "Alice", "Mary", "Bob", "Bob", "Bob")));
	}
}
