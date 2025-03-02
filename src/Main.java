public class Main {
    public static void main(String[] args) {
        LoggerProcessor loggerProcessor=new InfoLogProcessor(new DebugProcessor(new ErrorProcessor(null)));
        loggerProcessor.log(LoggerProcessor.DEBUG,"your process is in dubug");
        loggerProcessor.log(LoggerProcessor.INFO,"your process is in Info");
        loggerProcessor.log(LoggerProcessor.ERROR,"your process is in Error");

    }
}