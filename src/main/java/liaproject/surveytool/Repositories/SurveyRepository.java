package liaproject.surveytool.Repositories;

import liaproject.surveytool.Models.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveyRepository extends JpaRepository<Survey, Long> {
  // Här kan du lägga till egna query-metoder om det behövs senare.
}
