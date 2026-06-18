public class Main {
    public static void main(String[] args) {
        QuadraticEquation qe = new QuadraticEquation(1, 1, 1);
        System.out.printf("%fx^2 + %fx + %f", qe
                .getA(), qe.getB(), qe.getC());
        System.out.println("\nDelta: " + qe.getDiscriminant());
        System.out.println("Nghiệm 1: " + qe.getRoot1());
        System.out.println("Nghiệm 2: " + qe.getRoot2());
    }
}
