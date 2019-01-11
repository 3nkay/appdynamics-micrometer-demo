package home.nkavtur.mictometerdemo;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.Message;

@Component
public class UserListener {

    @JmsListener(destination = "usersQueue", containerFactory = "myFactory")
    public void listen(Message message) {
        System.out.println(message);
    }


}
