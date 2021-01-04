package kz.jm.nazira.service;

import kz.jm.nazira.dao.UserDao;
import kz.jm.nazira.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {

    public List<User> index();

    public User show(Long id);

    public void save(User user);

    public void update(Long id, User updatedUser);

    public void delete(Long id);
}
