package ru.evsmanko.mankoff.service;

import ru.evsmanko.mankoff.entity.UserInfo;

import java.util.ArrayList;
import java.util.Optional;

public interface UserInfoService {
   ArrayList<UserInfo> findAll();
 //  Optional<UserInfo> findUserInfoByUserId(long id);
   UserInfo save();
}
