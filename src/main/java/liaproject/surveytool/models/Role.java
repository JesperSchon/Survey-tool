package liaproject.surveytool.models;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Role {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long roleId;
  private String roleName;

  @OneToMany(mappedBy = "role")
  private List<User> users;
}