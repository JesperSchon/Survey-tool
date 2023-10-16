package liaproject.surveytool.datamodel;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class TypeOfAnswer {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long typeId;
  private String typeName;

  @OneToMany(mappedBy = "type")
  private List<Question> questions;
}
