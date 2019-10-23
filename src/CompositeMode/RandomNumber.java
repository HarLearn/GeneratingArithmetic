package CompositeMode;

import java.util.Random;

public class RandomNumber{

    public static String getRandomNumber(int numberRange, boolean isNagetive,boolean isRange){
        Random randomNum = new Random();
        String number = "";
        String numbers = "0123456789";
        if (isRange) {
            StringBuffer randomNumbers = new StringBuffer();
            // 产生一个数
            for (int i = 0; i < 30; i++) {
                int rand = randomNum.nextInt(10);
                randomNumbers.append(numbers.substring(rand, rand + 1));
            }
            // 排除 数字 是 0 开头的
            while (randomNumbers.charAt(0) == '0') {
                randomNumbers.deleteCharAt(0);
                int rand = randomNum.nextInt(10);
                randomNumbers.append(numbers.substring(rand, rand + 1));
            }
            number = randomNumbers.toString();
        }else{
            number = randomNum.nextInt(numberRange)+ "";
        }
        if (isNagetive){
            return "(-" + number + ")";
        }else{
            return number;
        }
    }
}
