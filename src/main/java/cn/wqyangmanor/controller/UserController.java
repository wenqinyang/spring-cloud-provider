package cn.wqyangmanor.controller;

import cn.wqyangmanor.dao.UserRepository;
import cn.wqyangmanor.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wqyang
 * @version 1.0
 * @date 2021/1/17 18:55
 */
@RestController
public class UserController {

  @Autowired
  private UserRepository userRepository;
  @GetMapping("/{id}")
  public User findById(@PathVariable Long id){
    User finOne = this.userRepository.findOne(id);
    return finOne;
  }
}
