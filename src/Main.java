public class Main {
    public static void main(String[] args) {
        LoggerProcessor loggerProcessor=new InfoLogProcessor(new DebugProcessor(new ErrorProcessor(null)));
        loggerProcessor.log(LoggerProcessor.DEBUG,"your process is in dubug");
        System.out.println("Hello, World!");
    }
}