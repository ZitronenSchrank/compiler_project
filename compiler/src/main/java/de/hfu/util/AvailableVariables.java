package de.hfu.util;

import java.util.HashSet;
import java.util.Set;

public class AvailableVariables {
    Set<String> availableVariables;
    Set<String> forbiddenVariables;

    public AvailableVariables() {
        availableVariables = new HashSet<>();
        forbiddenVariables = new HashSet<>();
    }

    public boolean addAvailableVariable(String variable) {
        return availableVariables.add(variable);
    }

    public boolean addForbiddenVariable(String variable) {
        return availableVariables.add(variable);
    }

    public boolean availableVariablesContains(String variable) {
        return availableVariables.contains(variable);
    }

    public boolean forbiddenVariablesContains(String variable) {
        return forbiddenVariables.contains(variable);
    }

    public boolean contains(String variable) {
        return availableVariables.contains(variable) | forbiddenVariables.contains(variable);
    }
}
