public abstract class LoggerProcessor {
    public static int DEBUG=1;
    public static int ERROR=2;
    public static int INFO=3;

    LoggerProcessor nextLoggerProcessor;
    public LoggerProcessor(LoggerProcessor loggerProcessor){
        this.nextLoggerProcessor= loggerProcessor;
    }
    public void log(int loglevel,String message){
        if(nextLoggerProcessor!=null){
            nextLoggerProcessor.log(loglevel,message);
        }
    }
}
