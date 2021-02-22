package be.intecbrussel.util;

import be.intecbrussel.model.User;

public class UserValidator {
    public static boolean validateUserPassword(User user, String password) {
        return user.getPassword().equals(password);
    }

}
