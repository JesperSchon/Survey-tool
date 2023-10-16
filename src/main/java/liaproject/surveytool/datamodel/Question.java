package liaproject.surveytool.datamodel;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Question {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long questionId;
  private String questionText;

  @ManyToOne
  @JoinColumn(name = "type_id")
  private TypeOfAnswer type;
}