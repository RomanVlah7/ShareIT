package project.shareit.user;

import org.springframework.stereotype.Service;
import project.shareit.user.dto.UserDto;
import project.shareit.user.model.User;

@Service
public class UserService {

    private UserDto userDto = new UserDto();

    public String getAllUsers(){
        return userDto.getAllUsersFromDB();
    }

    public String addUser(User user){
        return userDto.addUserToDB(user);
    }

    public String editUser(Long userID, User user){
        return userDto.editUserFromDB(userID, user);
    }
}

