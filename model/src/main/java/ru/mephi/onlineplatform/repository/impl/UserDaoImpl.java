package ru.mephi.onlineplatform.repository.impl;

import ru.mephi.onlineplatform.entities.SystemRole;
import ru.mephi.onlineplatform.entities.User;
import ru.mephi.onlineplatform.repository.dao.UserDao;

import java.util.*;
import java.util.stream.Collectors;

public class UserDaoImpl implements UserDao {
    private Map<Long, User> users = new HashMap<>();
    private Long counter = 0L;

    @Override
    public User save(User user) {
        user.setId(counter++);
        users.put(user.getId(), user);
        return user;
    }

    @Override
    public User edit(Long id, User user) throws Exception {
        if (users.containsKey(id)) {
            users.put(id, user);
            return user;
        }
        throw new Exception("No user with specified id!");
    }

    @Override
    public void delete(Long id) throws Exception {
        if (users.containsKey(id)) {
            users.remove(id);
            return;
        }
        throw new Exception("No user with specified id!");
    }

    @Override
    public User findById(Long id) throws Exception {
        if (users.containsKey(id)) {
            return users.get(id);
        }
        throw new Exception("No user with specified id!");
    }

    @Override
    public List<User> selectByRole(SystemRole systemRole) {
        return users.values().stream()
                .filter(user -> Objects.equals(user.getUserRole(), systemRole))
                .collect(Collectors.toList());
    }
}
