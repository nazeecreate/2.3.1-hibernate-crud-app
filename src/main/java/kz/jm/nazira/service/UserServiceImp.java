package kz.jm.nazira.service;

import kz.jm.nazira.dao.UserDao;
import kz.jm.nazira.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class UserServiceImp implements UserService{
    @Autowired
    private UserDao userDao;

    @Transactional(readOnly = true)
    @Override
    public List<User> index() {
        return userDao.index();
    }

    @Transactional(readOnly = true)
    @Override
    public User show(Long id) {
        return userDao.show(id);
    }

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void update(Long id, User updatedUser) {
        userDao.update(id,updatedUser);
    }

    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }
}
