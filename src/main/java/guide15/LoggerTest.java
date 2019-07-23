package guide15;

import org.junit.Test;
import sun.rmi.runtime.Log;

import static guide15.Logger.getLoggerInstance;
import static org.junit.Assert.*;

public class LoggerTest {

    @Test
    public void loggerAsSingleton(){
        getLoggerInstance().log("FALOPITA");
        getLoggerInstance().log("FALOPITA");
        getLoggerInstance().log("FALOPITA");

        getLoggerInstance().getLog();
    }


}