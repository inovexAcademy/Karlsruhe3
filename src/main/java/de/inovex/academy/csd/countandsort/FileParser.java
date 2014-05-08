/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.inovex.academy.csd.countandsort;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author Torsten
 */
public class FileParser {

	public List<String> parse(List<String> lines) {
		Map<String, Integer> parsedInput = parseInput(lines);

		List<String> output = createOutput(parsedInput);
		
		return output;
	}

	private Map<String, Integer> parseInput(List<String> lines) {
		Map<String, Integer> map = new TreeMap<>();
		
		for (String line : lines) {
			Integer count = map.get(line);
			if (count == null) {
				map.put(line, 1);
			} else {
				map.put(line, count + 1);
			}
		}
		
		return map;
	}

	private List<String> createOutput(Map<String, Integer> parsedInput) {
		List<String> lines = new ArrayList<>();
		
		for(Map.Entry<String, Integer> entry : parsedInput.entrySet()) {
			lines.add(entry.getValue() + " " + entry.getKey());
		}
		
		return lines;
	}
}
