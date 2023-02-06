package com.dbs.couchtest.rest;

import com.dbs.couchtest.entity.User;
import com.dbs.couchtest.repository.UserRepository;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserRequest {

    @Autowired
    private UserRepository userRepository;

    AtomicInteger atomicInteger = new AtomicInteger();

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userRepository.findByEmailLike("test");
    }

    @PostMapping("/add")
    public User addUSer() {


        int a = atomicInteger.getAndAdd(1);

        User u1 = createUser("user::000" + a, "Perry" + a, "Manson" + a, "perry.mason@acme.com" + a,
                "Who can we get on the case?");
        return userRepository.save(u1);

    }

    public static User createUser(String id, String firstName, String lastName,
                                  String email, String tagLine) {
        User user = new User();
        user.setId(id);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setTagLine(tagLine);
        return user;
    }
}
