public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private double height;
    private double weight;

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

    public Jaeger() {
    }

    public Jaeger(String modelName, String mark, String origin, double height, double weight) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
    }


    public String printEnergyCore(String modelName) {
        if ("CoyoteTango".equals(modelName)) {
            return " uses Iso-thor reaction chamber";
        } else if ("ChernoAlpha".equals(modelName)) {
            return " uses Stun Core 08";
        } else {
            return ", hmm, something new.. Interesting!";
        }
    }

    public String useMainFightingTechnique(String modelName) {
        if ("CoyoteTango".equals(modelName)) {
            return " uses Supercritical throwdown";
        } else if ("ChernoAlpha".equals(modelName)) {
            return " uses Sluggernaut Headshock";
        } else {
            return " is not so usual as I thought";
        }
    }

    public int printStrength() {
        if ("CoyoteTango".equals(modelName)) {
            return 7;
        } else if ("ChernoAlpha".equals(modelName)) {
            return 10;
        } else {
            return 0;
        }
    }
}