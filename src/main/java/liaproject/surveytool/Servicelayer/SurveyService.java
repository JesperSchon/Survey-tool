package liaproject.surveytool.Servicelayer;

import liaproject.surveytool.Models.Survey;
import liaproject.surveytool.Repositories.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SurveyService {

  @Autowired
  private SurveyRepository surveyRepository;

  public Survey createSurvey(Survey survey){
    return surveyRepository.save(survey);
  }

  public void deleteSurvey(Long surveyId){
    surveyRepository.deleteById(surveyId);
  }

  public Survey getSurveyById(Long surveyId){
    return surveyRepository.findById(surveyId).orElse(null);
  }

  public Survey updateSurvey(Survey survey){
    Survey existingSurvey = surveyRepository.findById(survey.getSurveyId()).orElse(null);
    existingSurvey.setTitle(survey.getTitle());
    existingSurvey.setUpdateDate(survey.getUpdateDate());
    return surveyRepository.save(existingSurvey);
  }
}
