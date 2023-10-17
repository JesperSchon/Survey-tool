package liaproject.surveytool.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
@Data
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