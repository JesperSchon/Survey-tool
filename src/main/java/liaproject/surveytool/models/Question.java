package liaproject.surveytool.models;

import jakarta.persistence.*;

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
