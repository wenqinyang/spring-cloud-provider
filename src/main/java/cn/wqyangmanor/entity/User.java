package cn.wqyangmanor.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author wqyang
 * @version 1.0
 * @date 2021/1/17 18:46
 */
@Entity
@Data
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @Column
  private String username;
  @Column
  private String name;
  @Column
  private String age;
  @Column
  private BigDecimal balance;
}
