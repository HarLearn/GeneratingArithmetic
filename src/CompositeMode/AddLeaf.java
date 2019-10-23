package CompositeMode;

public class AddLeaf implements ArithmeticComponent {
    @Override
    public String generateArithmetic(String arithmatic) {
        return arithmatic + " + ";
    }

    @Override
    public boolean isBracket() {
        return false;
    }
}
