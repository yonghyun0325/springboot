package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.UserDTO;

public interface UserService {

	int insertUser(UserDTO dto);

	List<UserDTO> getUserList();

	int updateUser(UserDTO dto);

	UserDTO login(UserDTO dto);

	UserDTO getUser(int int1);

	int deleteUser(int int1);

}
