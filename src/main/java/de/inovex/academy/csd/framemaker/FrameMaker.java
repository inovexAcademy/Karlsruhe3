package de.inovex.academy.csd.framemaker;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class FrameMaker {

    public List<String> makeFrame(List<String> lines) {
        ArrayList<String> frameLines = new ArrayList<>();
        int maxLen = maxLen(lines);

        frameLines.add(makeBlock(maxLen));
        for (String line : lines) {
            frameLines.add(makeLine(line, maxLen));
        }
        frameLines.add(makeBlock(maxLen));
        
        return frameLines;
    }

    private String makeLine(String line, int maxLen) {
        return blockLine(line, maxLen, ' ');
    }

    private String makeBlock(int maxLen) {
        return blockLine("", maxLen, '*');
    }

    private String blockLine(String in, int len, char padChar) {
        return "*" + StringUtils.rightPad(in, len, padChar) + "*";
    }

    private int maxLen(Iterable<String> strings) {
        int maxLen = 0;
        for (String s : strings) {
            maxLen = Math.max(maxLen, s.length());
        }
        return maxLen;
    }
}
