package behavioral.chainOfResponsibility;

public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level){
        this.level=level;
    }
    @Override
    protected void write(String message) {
        System.out.printf("Standart Console->Logger: "+ message);
    }
}
