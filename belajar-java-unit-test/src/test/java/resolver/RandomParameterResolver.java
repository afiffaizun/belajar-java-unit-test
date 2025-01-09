package resolver;

import org.junit.jupiter.api.extension.*;
import java.util.Random;

public class RandomParameterResolver implements ParameterResolver {

    private final Random random = new Random();

    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) {
        return parameterContext.getParameter().getType() == Random.class;
    }

    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) {
        return random;
    }
}
