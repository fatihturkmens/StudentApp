package com.studentmanagament.studentmanagament.Repository;

import com.studentmanagament.studentmanagament.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
