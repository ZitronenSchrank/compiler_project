package de.hfu.util;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Stack;

public class AvailableVariables {
    private Stack<Set<String>> availableVariables;
    private Stack<Set<String>> readOnlyVariables;

    public AvailableVariables() {
        availableVariables = new Stack<>();
        readOnlyVariables = new Stack<>();
        pushNewContext();
    }

    public void pushNewContext() {
        try {
            // Copy Every VarName From Old Context Into The New One
            Set<String> oldAvailable = availableVariables.lastElement();
            Set<String> oldReadOnly = readOnlyVariables.lastElement();

            Set<String> newAvailable = new HashSet<>();
            Set<String> newReadOnly = new HashSet<>();

            for (var s : oldAvailable) {
                newAvailable.add(s);
            }
            for (var s : oldReadOnly) {
                newReadOnly.add(s);
            }

            availableVariables.push(newAvailable);
            readOnlyVariables.push(newReadOnly);
        } catch (NoSuchElementException e) {
            availableVariables.push(new HashSet<>());
            readOnlyVariables.push(new HashSet<>());
        }
    }

    public boolean pop() {
        if (availableVariables.size() <= 1) {
            return false;
        } else {
            availableVariables.pop();
            readOnlyVariables.pop();
            return true;
        }

    }

    public boolean addAvailableVariable(String variable) {
        return availableVariables.lastElement().add(variable);
    }

    public boolean addReadOnlyVariable(String variable) {
        return readOnlyVariables.lastElement().add(variable);
    }

    public boolean availableVariablesContains(String variable) {
        Set<String> set = availableVariables.lastElement();
        if (set.contains(variable) == true) {
            return true;
        }
        return false;

    }

    public boolean readOnlyVariablesContains(String variable) {
        Set<String> set = readOnlyVariables.lastElement();
        if (set.contains(variable) == true) {
            return true;
        }
        return false;
    }

    public boolean contains(String variable) {

        if (availableVariables.lastElement().contains(variable)
                | readOnlyVariables.lastElement().contains(variable)) {
            return true;
        }

        return false;
    }
}
