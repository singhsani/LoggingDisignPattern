public class InfoLogProcessor extends LoggerProcessor{
    public InfoLogProcessor(LoggerProcessor nextLoggerProcessor) {
        super(nextLoggerProcessor);
    }
    public void log(int logLevel,String message){
        if(logLevel==INFO){
            System.out.println("INFO: " + message);
        }else{
            super.log(logLevel,message);
        }
    }
}
