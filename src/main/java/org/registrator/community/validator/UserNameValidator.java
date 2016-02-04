package org.registrator.community.validator;

import org.registrator.community.dao.UserRepository;
import org.registrator.community.dto.ResourceTypeDTO;
import org.registrator.community.dto.UserNameDTO;
import org.registrator.community.forms.RegistrationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class UserNameValidator implements Validator {

    @Autowired
    public UserRepository userRepository;

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.equals(RegistrationForm.class);
    }

    /**
     * Validate user login, password confirmation and email
     */
    @Override
    public void validate(Object target, Errors errors) {
        RegistrationForm registrationForm = (RegistrationForm) target;

        if (userRepository.findUserByLogin(registrationForm.getLogin()) != null) {
            errors.rejectValue("login", "msg.resourcetype.typename.exist");
        }
        if(!(registrationForm.getPassword()).equals(registrationForm.getConfirmPassword())){
            errors.rejectValue("confirmPassword", "msg.resourcetype.typename.exist");
        }
        if(userRepository.getUserByEmail(registrationForm.getEmail()) != null){
            errors.rejectValue("email", "msg.resourcetype.typename.exist");
        }
    }
}
