package com.test.Repository;

import com.test.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> 
{
    public User findByPsid(String psid);
    public User findByPsidAndPassword(String psid, String password);
}
