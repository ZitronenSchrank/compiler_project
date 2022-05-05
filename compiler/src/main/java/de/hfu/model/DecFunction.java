package de.hfu.model;

public class DecFunction {
    private String id;
    private boolean isImplemented;

    public DecFunction(String id) {
        this.id = id;
        this.isImplemented = false;
    }

    public DecFunction(String id, boolean isImplemented) {
        this.id = id;
        this.isImplemented = isImplemented;
    }

    public void setImplemented(boolean isImplemented) {
        this.isImplemented = isImplemented;
    }

    public String getId() {
        return id;
    }

    public boolean isImplemented() {
        return isImplemented;
    }

}
