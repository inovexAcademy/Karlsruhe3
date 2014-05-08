/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.inovex.academy.csd;

import static de.inovex.academy.csd.utils.ExternalProcessMatcher.printsOnStdout;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/**
 *
 * @author Torsten
 */
public class SkelettonTest {

	@Test
	public void testSimpleCall() {
		assertThat(asList("src/main/resources/runSkeletton.cmd"), printsOnStdout("Hallo Skelettor from Java\n"));
	}
}
