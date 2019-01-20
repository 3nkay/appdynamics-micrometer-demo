package home.nkavtur.api;

import home.nkavtur.api.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@SpringBootApplication
@RestController
@RequestMapping("/users")
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

    @Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping
    public void user(@RequestBody User user) {
        jmsTemplate.convertAndSend("usersQueue", user.setUuid(UUID.randomUUID().toString()));
    }

}

