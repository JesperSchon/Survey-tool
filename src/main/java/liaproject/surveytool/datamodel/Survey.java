package liaproject.surveytool.datamodel;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Survey {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long surveyId;
  private String title;
  private Date createdDate;
  private Date updateDate;

  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;


}
