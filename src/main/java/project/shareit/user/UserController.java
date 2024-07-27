package project.shareit.user;

import org.springframework.web.bind.annotation.*;
import project.shareit.user.model.User;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    private UserService userService = new UserService();

    @GetMapping("/allUsers")
    public String getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @PatchMapping("/editUser")
    public String editUser(@RequestHeader Long userID, @RequestBody User user){
        return userService.editUser(userID, user);
    }
}
