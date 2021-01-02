package kz.jm.nazira.dao;

import kz.jm.nazira.model.User;
import org.springframework.stereotype.Component;

import java.util.List;

public interface UserDao {
    public List<User> index();

    public User show(int id);

    public void save(User person);

    public void update(int id, User updatedPerson);

    public void delete(int id);
}
