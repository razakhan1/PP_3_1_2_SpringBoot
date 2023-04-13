package spring_boot.PP_3_1_2_SrpimgBoot.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring_boot.PP_3_1_2_SrpimgBoot.dao.UserDao;
import spring_boot.PP_3_1_2_SrpimgBoot.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{


    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public void create(User user) {
        userDao.create(user);
    }

    @Override
    public User read(Long id) {
        return userDao.read(id);
    }

    @Transactional
    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> listUser() {
        return userDao.listUser();
    }
}
