package de.inovex.academy.csd.framemaker;

import java.util.ArrayList;
import java.util.List;

public class FrameMaker {

    public List<String> makeFrame(List<String> lines) {
        ArrayList<String> frameLines = new ArrayList<>();
        int maxLen = maxLen(lines);
        Blocker blocker = new Blocker(maxLen, this);

        frameLines.add(blocker.makeBlock());
        for (String line : lines) {
            frameLines.add(blocker.makeLine(line));
        }
        frameLines.add(blocker.makeBlock());

        return frameLines;
    }

    private int maxLen(Iterable<String> strings) {
        int maxLen = 0;
        for (String s : strings) {
            maxLen = Math.max(maxLen, s.length());
        }
        return maxLen;
    }
}
