package com.repository;

import com.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    @Query("select u from User u where u.mobile = ?1 and u.password = ?2")
    User findUserByMobileAndPassword(String mobile, String password);


    @Query("select u from User u where u.mobile = ?1")
    User findUserByMobile(String mobile);

    @Query("select u from User u where u.userName = ?1")
    User findUserByUserName(String userName);

}
