public class JaegerTest {
    public static void main(String[] args) {
        Jaeger Jaeger1 = new Jaeger();
        Jaeger Jaeger2 = new Jaeger("ChernoAlpha", "Mark-1", "Russia", 85.34, 2.412);

        Jaeger1.setModelName("CoyoteTango");
        Jaeger1.setMark("Mark-1");
        Jaeger1.setOrigin("Japan");
        Jaeger1.setHeight(85.34);
        Jaeger1.setWeight(2.312);

        System.out.println("Today we have two guests: \nIn the left corner in red trousers it's" + 
                Jaeger1.getModelName() + "\nThe main mark is " + Jaeger1.getMark() + " from " + 
                Jaeger1.getOrigin() + "\nIt's height is " + Jaeger1.getHeight() + " m." + 
                "It's weight is " + Jaeger1.getWeight() + " tons.");
        System.out.println("\nIn the right corner in blue trousers it's" + 
                Jaeger2.getModelName() + "\nThe main mark is " + Jaeger2.getMark() + " from " + 
                Jaeger2.getOrigin() + "\nIt's height is " + Jaeger2.getHeight() + " m." + 
                "It's weight is " + Jaeger2.getWeight() + " tons.");
        System.out.println("Let's fight!");
        System.out.println("" + Jaeger1.getModelName() + Jaeger1.printEnergyCore(Jaeger1.getModelName()));
        System.out.println("" + Jaeger2.getModelName() + Jaeger2.printEnergyCore(Jaeger2.getModelName()));
        System.out.println("" + Jaeger1.getModelName() + Jaeger1.useMainFightingTechnique(Jaeger1.getModelName()));
        System.out.println("" + Jaeger2.getModelName() + Jaeger2.useMainFightingTechnique(Jaeger2.getModelName()));
        getFight(Jaeger1, Jaeger2);
    }

    private static void getFight(Jaeger Jaeger1, Jaeger Jaeger2) {
        if (Jaeger1.printStrength() > Jaeger2.printStrength()) {
            System.out.println(Jaeger1.getModelName() + " wins!");
        } else if (Jaeger1.printStrength() < Jaeger2.printStrength()) {
            System.out.println(Jaeger2.getModelName() + " wins!");
        } else {
            System.out.println("You are both have equal strength. Don't waste your time");
        }
    }
}