package behavioral.chainOfResponsibility;

public class FileLogger extends AbstractLogger{
    public FileLogger(int level){
        this.level=level;
    }
    @Override
    protected void write(String message) {
        System.out.printf("File Console->Logger: "+ message);
    }
}
