package com.web.service.impl;

import com.web.dao.PUsersMapper;
import com.web.model.PUsers;
import com.web.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("usersService")
public class UsersServiceImpl implements UsersService {

    @Autowired
    private PUsersMapper pUsersMapper;

    @Override
    public PUsers getUsers(PUsers users) {

        return pUsersMapper.getUsers(users);
    }

    @Override
    public boolean addUsers(PUsers pUsers) {
        return false;
    }

    @Override
    public boolean updateUsers(PUsers pUsers) {
        return false;
    }

    @Override
    public List<PUsers> getUsersList(PUsers pUsers, String password) {
        if (password=="mac0385")
            return pUsersMapper.getUsersList(pUsers);
        else
            return null;
    }

    @Override
    public boolean deleteUsers(PUsers pUsers, String password) {
        return false;
    }
}
