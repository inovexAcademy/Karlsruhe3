package de.inovex.academy.csd.framemaker;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class FrameMaker {
	public List<String> makeFrame(List<String> lines) {
		ArrayList<String> frameLines = new ArrayList<>();
		int maxLen = maxLen(lines) ;
		String block = blockOf(maxLen + 2);
		frameLines.add(block);
		for (String line : lines) {
			frameLines.add("*" + rpad(line, maxLen) + "*");
		}
		frameLines.add(block);
		return frameLines;
	}

	private String blockOf(int len) {
		return StringUtils.repeat("*", len);
	}

	private String rpad(String in, int len) {
		StringBuilder ret = new StringBuilder();
		ret.append(in);
		for (int i=in.length(); i < len; i++) {
			ret.append(" ");
		}
		return ret.toString();
	}
	
	private int maxLen(Iterable<String> strings) {
		int maxLen = 0;
		for (String s : strings) {
			maxLen = Math.max(maxLen, s.length());
		}
		return maxLen;
	}
}
