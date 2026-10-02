package Problem3;

public abstract class GardenTool {

    public GardenTool() {
        super();
    }

    protected String baseUse() {
        return "Using the tool in the garden";
    }

    public abstract String use();
}