package CompositeMode;

public class DivideLeaf implements ArithmeticComponent {
    @Override
    public String generateArithmetic(String arithmatic) {
        return arithmatic + " / ";
    }

    @Override
    public boolean isBracket() {
        return false;
    }
}
