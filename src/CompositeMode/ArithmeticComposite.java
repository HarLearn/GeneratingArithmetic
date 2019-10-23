package CompositeMode;

import java.util.ArrayList;
import java.util.HashSet;

public class ArithmeticComposite{

    ArrayList<ArithmeticComponent> operators = new ArrayList<>();
    public void addOperator(ArithmeticComponent operator){
        operators.add(operator);
    }

    private String generateArithmetic(Arithmetic arithmetic) {
        boolean isBracket = true;
        String arithmatic = RandomNumber.getRandomNumber(arithmetic.getNumberRange(),arithmetic.isNagetive(),true);
        for(int i = 1; i < arithmetic.getNumberOpera(); i++){
            ArithmeticComponent operator = operators.get(Integer.parseInt(RandomNumber.getRandomNumber(operators.size(),false,false)));
            if (operator.isBracket()&&isBracket){
                arithmatic = operator.generateArithmetic(arithmatic);
                isBracket = false;
                i--;
            }else if (!operator.isBracket()){
                arithmatic = operator.generateArithmetic(arithmatic) + RandomNumber.getRandomNumber(arithmetic.getNumberRange(),arithmetic.isNagetive(),true);
                isBracket = true;
            }
        }
        return arithmatic;
    }

    public HashSet<String> generateArithmetics(Arithmetic arithmetic){
        HashSet<String> arithmetics = new HashSet<>();
        while(arithmetics.size() < arithmetic.getArithNumbers()){
            String arith = this.generateArithmetic(arithmetic);
            if (arithmetic.isResult()){
                String result = ComputeResults.getArithmeticReuslt(arith);
                if (Double.parseDouble(result) < arithmetic.getResultNumberRange()){
                    arith += " = " + String.format("%.3f",Double.parseDouble(result));
                }else{
                    continue;
                }
            }else{
                arith += " = ";
            }

            arithmetics.add(arith);
        }
        return arithmetics;
    }

}
