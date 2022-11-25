package com.startjava.lesson_2_3_4.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private double height;
    private double weight;

    public Jaeger() {
    }

    public Jaeger(String modelName, String mark, String origin, double height, double weight) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void printEnergyCore() {
        if ("CoyoteTango".equals(modelName)) {
            System.out.println(modelName + " uses Iso-thor reaction chamber");
        } else if ("ChernoAlpha".equals(modelName)) {
            System.out.println(modelName + " uses Stun Core 08");
        } else {
            System.out.println(modelName + ", hmm, something new.. Interesting!");
        }
    }

    public void useMainFightingTechnique() {
        if ("CoyoteTango".equals(modelName)) {
            System.out.println(modelName + " uses Supercritical throwdown");
        } else if ("ChernoAlpha".equals(modelName)) {
            System.out.println(modelName + " uses Sluggernaut Headshock");
        } else {
            System.out.println(modelName + " is not so usual as I thought");
        }
    }

    public int getStrength() {
        if ("CoyoteTango".equals(modelName)) {
            return 7;
        } else if ("ChernoAlpha".equals(modelName)) {
            return 10;
        } else {
            return 0;
        }
    }
}