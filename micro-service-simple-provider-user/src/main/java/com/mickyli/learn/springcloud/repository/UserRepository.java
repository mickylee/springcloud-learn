package com.mickyli.learn.springcloud.repository;

import com.mickyli.learn.springcloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by liqian on 2017/6/7 0007.
 */
public interface UserRepository extends JpaRepository<User,Long>{
}
