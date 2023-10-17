package liaproject.surveytool.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class TypeOfAnswer {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long typeId;
  private String typeName;

  @OneToMany(mappedBy = "type")
  private List<Question> questions;
}