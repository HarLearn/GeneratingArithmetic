package CompositeMode;

import java.io.IOException;
import java.util.HashSet;

public class ArithmeticTest {
    public static void main(String[] args) {

        Arithmetic arithmetic = new Arithmetic();
        arithmetic.setArithNumbers(4); //设置题目数
        arithmetic.setNumberOpera(2);   // 设置操作数
        arithmetic.setMultiAnddiv(ConstVariable.isMultiAnddiv);// 是否含有乘除
        arithmetic.setNagetive(false);   // 是否含有负数
        arithmetic.setResult(true);     // 是否显示结果
        HashSet<String> ee =  arithmetic.generateArithmetics();
        for(String s : ee){
            System.out.println(s);
        }
        try {
            SaveTofFile.saveFile(ee);
        } catch (IOException e) {
            System.out.println("文件保存异常，异常信息为：\n"+e.getMessage());
        }

    }

}
