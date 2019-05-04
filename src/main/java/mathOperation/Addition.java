package mathOperation;

import org.springframework.stereotype.Component;

@Component
public class Addition implements MathOperation {
    public double oparate(double x, double y) {
        return x + y;
    }
}
