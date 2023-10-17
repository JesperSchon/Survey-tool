package liaproject.surveytool.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class Permission {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long permissionId;
  private String name; // t.ex. "CREATE_SURVEY", "DELETE_USER", osv.

  @ManyToMany(mappedBy = "permissions")
  private List<Role> roles;
}
