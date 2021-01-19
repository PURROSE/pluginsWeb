package com.web.service;

import com.web.model.PUsers;

import java.util.List;

public interface UsersService {
    public PUsers getUsers(PUsers users);

    public boolean addUsers(PUsers pUsers);
    public boolean updateUsers(PUsers pUsers);

    public List<PUsers> getUsersList(PUsers pUsers,String password);
    public boolean deleteUsers(PUsers pUsers,String password);
}
