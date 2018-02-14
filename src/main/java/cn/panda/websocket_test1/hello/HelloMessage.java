package cn.panda.websocket_test1.hello;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.java.Log;

/**
 * @author ZhuYunpeng
 * woscaizi@gmail.com
 * 2018/2/14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Log
public class HelloMessage {

    private String name;

}
