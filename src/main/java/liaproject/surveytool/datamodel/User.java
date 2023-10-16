package liaproject.surveytool.datamodel;

import jakarta.persistence.*;


@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long userId;
  private String username;
  private String email;
  private String passwordHash;

  @ManyToOne
  @JoinColumn(name = "role_id")
  private Role role;
}

