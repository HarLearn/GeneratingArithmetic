package CompositeMode;

public class BracketLeaf implements ArithmeticComponent {
    @Override
    public String generateArithmetic(String arithmatic) {
        return "(" + arithmatic + ")";
    }

    @Override
    public boolean isBracket() {
        return true;
    }
}
