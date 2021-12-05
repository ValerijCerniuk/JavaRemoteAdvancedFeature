package testingRecap;

import org.apache.log4j.Logger;

public class Calculator {

    public static final Logger LOGGER = Logger.getLogger(Calculator.class);

    public int add(int firstNumber, int seconNumbeer){
        LOGGER.info("Adding two numbers " + firstNumber + " + " + seconNumbeer);
        return firstNumber + seconNumbeer;
    }

    public int  addMultipleNumbers(int[] numbers){
        int result = 0;
        for(int number : numbers){
            result += number;
        }
        return result;
    }

}
