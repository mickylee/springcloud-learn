package com.mickyli.springcloud.repository;

import com.mickyli.springcloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by liqian on 2017/6/7 0007.
 */
public interface UserRepository extends JpaRepository<User,Long>{
}
