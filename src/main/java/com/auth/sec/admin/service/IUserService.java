package com.auth.sec.admin.service;



import java.util.List;

import com.auth.sec.admin.dto.UserRecord;
import com.auth.sec.admin.entity.User;

public interface IUserService {
    User add(User user);
    List<UserRecord> getAllUsers();
    void delete(String email);
   User getUser(String email);
    User update(User user);
}
