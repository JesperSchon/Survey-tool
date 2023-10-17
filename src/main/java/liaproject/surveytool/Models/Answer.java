package liaproject.surveytool.Models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Answer {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long answerId;
  private String textAnswer;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  @ManyToOne
  @JoinColumn(name = "question_id")
  private Question question;

  @ManyToOne
  @JoinColumn(name = "option_id")
  private Option option;
}