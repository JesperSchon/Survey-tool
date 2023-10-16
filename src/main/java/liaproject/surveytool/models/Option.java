package liaproject.surveytool.models;

import jakarta.persistence.*;

@Entity
public class Option {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long optionId;
  private String optionText;

  @ManyToOne
  @JoinColumn(name = "question_id")
  private Question question;
}
