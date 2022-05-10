package de.hfu.util;

import java.util.HashSet;
import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

public final class SemanticUtils {
    private SemanticUtils() {
    }

    public static boolean isEachParameterNameUnique(List<TerminalNode> functionParameters) {
        HashSet<String> parameterSet = new HashSet<>();

        for (var parameter : functionParameters) {
            if (!parameterSet.add(parameter.getText())) {
                return false;
            }
        }

        return true;
    }

}
