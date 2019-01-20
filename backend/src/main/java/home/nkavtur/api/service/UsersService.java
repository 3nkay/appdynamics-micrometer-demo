package home.nkavtur.api.service;

import home.nkavtur.api.domain.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UsersService {

    Map<String, User> cache = new HashMap<>();

    public void save(User user) {
        System.out.println("Saving " + user);
        cache.put(user.getUuid(), user);
    }
}
