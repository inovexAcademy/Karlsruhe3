/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.inovex.academy.csd.countandsort;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

/**
 *
 * @author Torsten
 */
public class FileReader {

	public List<String> readFile(String filename) throws IOException {
		File file = new File(filename);
		List<String> lines = Files.readAllLines(file.toPath());
		return lines;
	}

}
