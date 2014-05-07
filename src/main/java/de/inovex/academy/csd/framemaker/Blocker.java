/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.inovex.academy.csd.framemaker;

import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Torsten
 */
class Blocker {
    private final int maxLen;

    public Blocker(int maxLen, final FrameMaker blocker) {
        this.maxLen = maxLen;
    }

    String makeLine(String line) {
        return blockLine(line, maxLen, ' ');
    }

    public String makeBlock() {
        return blockLine("", maxLen, '*');
    }

    private String blockLine(String in, int len, char padChar) {
        return "*" + StringUtils.rightPad(in, len, padChar) + "*";
    }
    
}
