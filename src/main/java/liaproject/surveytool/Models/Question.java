package liaproject.surveytool.Models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Question {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long questionId;
  private String questionText;

  @ManyToOne
  @JoinColumn(name="type_id")
  private TypeOfAnswer type;
}
