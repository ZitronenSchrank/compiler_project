package de.hfu.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AvailableVariables {
    private List<Set<String>> availableVariables;
    private List<Set<String>> forbiddenVariables;

    public AvailableVariables() {
        availableVariables = new ArrayList<>();
        forbiddenVariables = new ArrayList<>();
        pushNewContext();
    }

    public void pushNewContext() {
        availableVariables.add(new HashSet<>());
        forbiddenVariables.add(new HashSet<>());
    }

    public boolean pop() {
        if (availableVariables.size() <= 1) {
            return false;
        } else {
            int indexToRemove = availableVariables.size() - 1;
            availableVariables.remove(indexToRemove);
            forbiddenVariables.remove(indexToRemove);
            return true;
        }

    }

    public boolean addAvailableVariable(String variable) {
        int currentIndex = availableVariables.size() - 1;
        return availableVariables.get(currentIndex).add(variable);
    }

    public boolean addForbiddenVariable(String variable) {
        int currentIndex = availableVariables.size() - 1;
        return availableVariables.get(currentIndex).add(variable);
    }

    public boolean availableVariablesContains(String variable) {
        for (var set : availableVariables) {
            if (set.contains(variable) == true) {
                return true;
            }
        }
        return false;
    }

    public boolean forbiddenVariablesContains(String variable) {
        for (var set : forbiddenVariables) {
            if (set.contains(variable) == true) {
                return true;
            }
        }
        return false;
    }

    public boolean contains(String variable) {
        for (int i = 0; i < availableVariables.size(); i++) {
            if (availableVariables.get(i).contains(variable) | forbiddenVariables.get(i).contains(variable)) {
                return true;
            }
        }
        return false;
    }
}
