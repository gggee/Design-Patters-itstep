package behavioral.chainOfResponsibility;

public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(int level){
        this.level=level;
    }
    @Override
    protected void write(String message) {
        System.out.printf("Error Console->Logger: "+ message);
    }
}
