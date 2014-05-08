/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.inovex.academy.csd.countandsort;

import static de.inovex.academy.csd.utils.ExternalProcessMatcher.printsOnStdout;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 *
 * @author Torsten
 */
public class CountAndSortAcceptanceTest {

	@Test
	public void testInputOutput() {
		assertThat(asList("src/main/resources/runCountAndSort.cmd", 
						"src/main/resources/countAndSortInput1.txt"),
						printsOnStdout("2 Alice\n3 Bob\n1 Mary\n"));

	}
}
