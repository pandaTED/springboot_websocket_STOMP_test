package cn.panda.websocket_test1.hello;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.logging.Logger;

/**
 * @author ZhuYunpeng
 * woscaizi@gmail.com
 * 2018/2/14
 */

@Controller
public class GreetingController {


    Logger logger = Logger.getLogger(GreetingController.class.getName());

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay


        logger.info("==================");
        logger.info("====>"+message.toString());
        logger.info("==================");

        return new Greeting("Hello, " + message.getName() + "!");
    }

}
