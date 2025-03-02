public class DebugProcessor extends LoggerProcessor{
    public DebugProcessor(LoggerProcessor nextLoggerProcessor) {
        super(nextLoggerProcessor);
    }

    public void log(int logLevel,String message){
        if(logLevel==DEBUG){
            System.out.println("DEBUG: "+message);
        }else{
            super.log(logLevel,message);
        }
    }
}
