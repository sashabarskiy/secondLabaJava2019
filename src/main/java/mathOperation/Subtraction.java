package mathOperation;

import org.springframework.stereotype.Component;

@Component
public class Subtraction implements MathOperation {
    public double oparate(double x, double y) {
        return x - y;
    }
}
