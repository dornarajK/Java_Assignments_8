package org.example.UnitTesting_8_1;

public class Pen {
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;
        Color(String color) { this.color = color; }
        @Override public String toString() { return color; }
    }

    private Color currentColor;
    private boolean isCapOn;

    public Pen() {
        this(Color.RED);
    }

    public Pen(Color initialColor) {
        this.currentColor = initialColor;
        this.isCapOn = true;
    }

    public void capOff() {
        isCapOn = false;
    }

    public void capOn() {
        isCapOn = true;
    }

    public String draw() {
        if (isCapOn) {
            return "";
        }
        return "Drawing " + currentColor.toString();
    }

    public void changeColor(Color newColor) {
        if (isCapOn) {
            this.currentColor = newColor;
        }
    }
}