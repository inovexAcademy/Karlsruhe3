/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.inovex.academy.csd.countandsort;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author Torsten
 */
public class CounterAndSorter {

	public static void main(String... args) throws IOException {
		if (args.length != 1) {
			throw new IllegalArgumentException("Eine Datei als Parameter bitte");
		}

		List<String> lines = new FileReader().readFile(args[0]);

		List<String> out = new FileParser().parse(lines);

		out.stream().forEach(System.out::println);
	}

}
