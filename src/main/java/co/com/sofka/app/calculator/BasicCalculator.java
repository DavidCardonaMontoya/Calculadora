package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long substract(Long number1, Long number2) {
        logger.info( "Substracting {} - {}", number1, number2 );
        return number1 - number2;
    }

    public Long multiplicate(Long number1, Long number2) {
        logger.info( "Multiplicating {} * {}", number1, number2 );
        return number1 * number2;
    }

    public String division(Long number1, Long number2) {
        logger.info( "Dividing {} / {}", number1, number2 );
        String rta;
        Double div = (double)number1/(double)number2;
        if (Double.isInfinite(div)){
            rta = "No se puede dividir por cero";
        } else if (Double.isNaN(div)){
            rta = "No está definida la división 0/0";
        } else{
            rta = String.valueOf(div);
        }
        return rta;
    }
}
