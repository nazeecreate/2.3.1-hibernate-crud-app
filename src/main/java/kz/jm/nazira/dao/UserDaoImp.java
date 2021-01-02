package kz.jm.nazira.dao;

import kz.jm.nazira.model.User;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Component
@Transactional
public class UserDaoImp implements UserDao{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> index() {
        List<User> users = entityManager.createQuery("from User").getResultList();
        return users;
    }

    @Override
    public User show(int id) {
        User user = entityManager.createQuery("from User where id = :id", User.class)
                .setParameter("id", id)
                .getSingleResult();
        return user;
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public void update(int id, User updatedUser) {
        User user = show(id);
        user.setFirstName(updatedUser.getFirstName());
        user.setLastName(updatedUser.getLastName());
        user.setAge(updatedUser.getAge());
    }

    @Override
    public void delete(int id) {
        User user = show(id);
        entityManager.remove(user);
    }

}
