package spring_boot.PP_3_1_2_SrpimgBoot.dao;


import org.springframework.stereotype.Repository;
import spring_boot.PP_3_1_2_SrpimgBoot.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    public void create(User user) {
        em.persist(user);
    }

    @Override
    public User read(Long id) {
        return em.find(User.class, id);
    }

    @Override
    public void update(User user) {
        em.merge(user);
    }

    @Override
    public void delete(Long id) {
        User user = em.find(User.class, id);
        em.remove(user);
    }

    @Override
    public List<User> listUser() {
        return em.createQuery("from User", User.class).getResultList();
    }
}
