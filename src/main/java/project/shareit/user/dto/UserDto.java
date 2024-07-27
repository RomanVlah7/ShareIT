package project.shareit.user.dto;

import org.springframework.stereotype.Repository;
import project.shareit.user.model.User;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDto {
    private Map<Long, User> users = new HashMap<>();

    public String getAllUsersFromDB(){
        return users.values().toString();
    }

    public String addUserToDB(User user){
        users.put(user.getUserID(), user);
        return "User added successful";
    }

    public String editUserFromDB(Long userID, User user){
        if(users.containsKey(userID)){
            users.remove(userID, user);
            users.put(userID, user);
            return "User info updated successful";
        }else{
            return "User not found";
        }
    }
}