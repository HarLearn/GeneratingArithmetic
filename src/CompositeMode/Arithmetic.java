package CompositeMode;

import java.util.HashSet;

public class Arithmetic {
    private int arithNumbers = 10; //题目数量
    private int numberRange = 100; // 设置数值范围
    private double resultNumberRange = 300; //结果的范围
    private int numberOpera = 3; //设置操作数
    private boolean isNagetive = false; //是否存在负数
    private boolean isMultiAnddiv = false; // 是否存在乘除
    private boolean isResult = true; // 是否需要结果

    public double getResultNumberRange() {
        return resultNumberRange;
    }

    public boolean isResult() {
        return isResult;
    }

    public void setResult(boolean result) {
        isResult = result;
    }

    public void setArithNumbers(int arithNumbers) {
        this.arithNumbers = arithNumbers;
    }

    public void setNumberRange(int numberRange) {
        this.numberRange = numberRange;
    }

    public void setResultNumberRange(double resultNumberRange) {
        this.resultNumberRange = resultNumberRange;
    }

    public void setNumberOpera(int numberOpera) {
        this.numberOpera = numberOpera;
    }

    public void setNagetive(boolean nagetive) {
        isNagetive = nagetive;
    }

    public void setMultiAnddiv(boolean multiAnddiv) {
        isMultiAnddiv = multiAnddiv;
    }

    public int getArithNumbers() {
        return arithNumbers;
    }

    public int getNumberRange() {
        return numberRange;
    }


    public int getNumberOpera() {
        return numberOpera;
    }

    public boolean isNagetive() {
        return isNagetive;
    }

    public HashSet<String> generateArithmetics(){
        ArithmeticComposite composite = new ArithmeticComposite();
        composite.addOperator(new AddLeaf());
        composite.addOperator(new SubtractLeaf());
        composite.addOperator(new BracketLeaf());
        if (this.isMultiAnddiv){
            composite.addOperator(new DivideLeaf());
            composite.addOperator(new MultiplyLeaf());
        }
        return composite.generateArithmetics(this);
    }
}
