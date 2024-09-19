package com.studentmanagament.studentmanagament.Controller;

import com.studentmanagament.studentmanagament.Entity.User;
import com.studentmanagament.studentmanagament.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/save")
    public User save(@RequestBody User user){
        return  userService.usersave(user);

    }
    @GetMapping("all")
    public List<User> all(){
      return   userService.findAll();
    }
    @GetMapping("id/{id}")
    public User findbyid(@PathVariable int id){
      return   userService.findbyid(id);
    }
    @PutMapping("update")
    public User update(@RequestBody User user){
        return userService.userupdate(user);

    }
    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable(name = "id") int id){
        userService.deleteUser(id);
    }

}
