package liaproject.surveytool.servicelayer;

import liaproject.surveytool.models.User;
import liaproject.surveytool.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public User createUser(User user){
    return userRepository.save(user);
  }

  public void deleteUser(Long userId){
    userRepository.deleteById(userId);
  }

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  public User getUserById(Long userId){
    return userRepository.findById(userId).orElse(null);
  }



}
