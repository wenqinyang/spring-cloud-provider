package cn.wqyangmanor.dao;

import cn.wqyangmanor.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * @author wqyang
 * @version 1.0
 * @date 2021/1/17 18:50
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
