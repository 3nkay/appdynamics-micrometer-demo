package home.nkavtur.api;

import home.nkavtur.api.domain.User;
import home.nkavtur.api.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@RequiredArgsConstructor
public class UserListener {

    private final UsersService usersService;

    @JmsListener(destination = "usersQueue", containerFactory = "myFactory")
    public void listen(User user) throws InterruptedException {
        Thread.sleep(new Random().nextInt(10) * 1000);

        if (!user.getEmail().contains("@")) {
            throw new RuntimeException("Email is not valid");
        }

        usersService.save(user);
    }

}
