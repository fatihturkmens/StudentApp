package com.studentmanagament.studentmanagament.Service;

import com.studentmanagament.studentmanagament.Entity.User;
import com.studentmanagament.studentmanagament.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User usersave(User user){
       userRepository.save(user);
        return  userRepository.save(user);

    }
    public User findbyid(int id){
      Optional<User> user=  userRepository.findById(id);
      if (user.isEmpty()){
          throw new RuntimeException("User not found");
      }
      else return user.get();
    }
    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User userupdate(User user){
      Optional<User> user1=  userRepository.findById(user.getId());
      if (user1.isEmpty()){
          throw new RuntimeException("User not found");
      }
      User user2 = user1.get();
      user2.setUsername(user.getUsername());
      return userRepository.save(user2);
    }

    public void deleteUser(int id){
        Optional<User> user1=  userRepository.findById(id);
        if (user1.isEmpty()){
            throw new RuntimeException("User not found");
        }

         userRepository.delete(user1.get());
    }
}
