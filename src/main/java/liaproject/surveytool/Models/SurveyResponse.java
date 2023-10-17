package liaproject.surveytool.Models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class SurveyResponse {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long responseId;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  @ManyToOne
  @JoinColumn(name = "survey_id")
  private Survey survey;

}