package liaproject.surveytool.datamodel;

import jakarta.persistence.*;

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
