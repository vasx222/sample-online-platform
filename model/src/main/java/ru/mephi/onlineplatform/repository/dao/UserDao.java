package ru.mephi.onlineplatform.repository.dao;

import ru.mephi.onlineplatform.entities.SystemRole;
import ru.mephi.onlineplatform.entities.User;

import java.util.List;

/**
 * @author Stanislav_Semichevskiy
 */
public interface UserDao {

    User save(User user);

    User edit(Long id, User user) throws Exception;

    void delete(Long id) throws Exception;

    User findById(Long id) throws Exception;

    List<User> selectByRole(SystemRole systemRole);
}
