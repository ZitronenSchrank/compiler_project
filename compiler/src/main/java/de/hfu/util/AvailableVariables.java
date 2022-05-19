package de.hfu.util;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Stack;

public class AvailableVariables {
    private Stack<Set<String>> availableVariables;
    private Stack<Set<String>> forbiddenVariables;

    public AvailableVariables() {
        availableVariables = new Stack<>();
        forbiddenVariables = new Stack<>();
        pushNewContext();
    }

    public void pushNewContext() {
        try {
            // Copy Every VarName From Old Context Into The New One
            Set<String> oldAvailable = availableVariables.lastElement();
            Set<String> oldForbidden = forbiddenVariables.lastElement();

            Set<String> newAvailable = new HashSet<>();
            Set<String> newForbidden = new HashSet<>();

            for (var s : oldAvailable) {
                newAvailable.add(s);
            }
            for (var s : oldForbidden) {
                newForbidden.add(s);
            }

            availableVariables.push(newAvailable);
            forbiddenVariables.push(newForbidden);
        } catch (NoSuchElementException e) {
            availableVariables.push(new HashSet<>());
            forbiddenVariables.push(new HashSet<>());
        }
    }

    public boolean pop() {
        if (availableVariables.size() <= 1) {
            return false;
        } else {
            availableVariables.pop();
            forbiddenVariables.pop();
            return true;
        }

    }

    public boolean addAvailableVariable(String variable) {
        return availableVariables.lastElement().add(variable);
    }

    public boolean addForbiddenVariable(String variable) {
        return forbiddenVariables.lastElement().add(variable);
    }

    public boolean availableVariablesContains(String variable) {
        Set<String> set = availableVariables.lastElement();
        if (set.contains(variable) == true) {
            return true;
        }
        return false;

    }

    public boolean forbiddenVariablesContains(String variable) {
        Set<String> set = forbiddenVariables.lastElement();
        if (set.contains(variable) == true) {
            return true;
        }
        return false;
    }

    public boolean contains(String variable) {

        if (availableVariables.lastElement().contains(variable)
                | forbiddenVariables.lastElement().contains(variable)) {
            return true;
        }

        return false;
    }
}
