package CompositeMode;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.math.BigDecimal;

public class ComputeResults {
    public static String getArithmeticReuslt(String arithmetic){
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine se = manager.getEngineByName("js");
        Object result = null;
        try {
            System.out.println("result");
            result = se.eval(arithmetic);
            System.out.println(result);
        } catch (ScriptException e) {
            System.out.println(result);
            e.printStackTrace();
        }
//        System.out.println(result);
//        BigDecimal bigDecimal = new BigDecimal(result.toString());
        return new BigDecimal(result.toString()).toPlainString();
    }
}
