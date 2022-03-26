package no.ntnu.idi.IDATT2105.qsProsjekt.service;

import no.ntnu.idi.IDATT2105.qsProsjekt.models.User;
import no.ntnu.idi.IDATT2105.qsProsjekt.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    UserRepository userRepository;

    LoginService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


}