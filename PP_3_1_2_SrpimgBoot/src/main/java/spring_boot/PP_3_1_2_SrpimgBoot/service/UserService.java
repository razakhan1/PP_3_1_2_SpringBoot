package spring_boot.PP_3_1_2_SrpimgBoot.service;



import spring_boot.PP_3_1_2_SrpimgBoot.model.User;

import java.util.List;

public interface UserService {
    void create(User user);

    User read(Long id);

    void update(User user);

    void delete(Long id);

    List<User> listUser();
}
