package com.example.login.service;

import com.example.login.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService {

    private Map<String, User> map = new HashMap<>();
    private Long count = 0L;
    //@Autowired
    //private UserRepository userRepository;

    public User findById(String userId) {
        if (map.containsKey(userId)) {
            return map.get(userId);
        }
        return null;
    }

    public User findByName(String name) {
        return null;
    }

    public void saveUser(User user) {
        map.put(user.getUserId(), user);
    }

    public void updateUser(User user) {
        map.replace(user.getUserId(), user);
    }

    public void deleteUserById(String userId) {
        map.remove(userId);
    }

    public void deleteAllUsers() {
        map.clear();
    }

    public List<User> findAllUsers() {
        return new ArrayList<User>(map.values());
    }

    public boolean isUserExist(User user) {
        if (!map.containsKey(user.getUserId())) {
            return false;
        }
        return true;
    }

}
