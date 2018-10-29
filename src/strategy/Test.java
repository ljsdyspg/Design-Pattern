package strategy;

public class Test {
    public static void main(String[] args) {

        Context context;

        context = new Context(new OperationAdd());
        System.out.println("1 + 2 = "+context.executeStrategy(1,2));

        context = new Context(new OperationSubstract());
        System.out.println("1 - 2 = "+context.executeStrategy(1,2));

        context = new Context(new OperationMultiply());
        System.out.println("1 * 2 = "+context.executeStrategy(1,2));
    }
}
