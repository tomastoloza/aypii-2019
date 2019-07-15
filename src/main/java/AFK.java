import java.awt.*;
import java.awt.event.KeyEvent;

public class AFK {

    static void run() throws AWTException, InterruptedException {
        Robot robot = new Robot();
        while(true){
            robot.keyPress(KeyEvent.VK_E);
            Thread.sleep(20000);
        }
    }

    public static void main(String[] args)  throws InterruptedException, AWTException {
        run();
    }

}
