package com.code.server.db.dao;


import com.code.server.db.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * Created by win7 on 2017/3/8.
 */
public interface IUserDao extends PagingAndSortingRepository<User, Long> {
    List<User> findByName(String name);


}
