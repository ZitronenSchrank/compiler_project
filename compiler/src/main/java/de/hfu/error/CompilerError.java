package de.hfu.error;

public class CompilerError {
    String message;

    public CompilerError(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Error: " + this.message;
    }
}
