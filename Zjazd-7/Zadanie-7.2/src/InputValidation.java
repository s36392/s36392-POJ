public class InputValidation {

    public static String validateNonEmpty(String value, String field) {
        if (value == null || value.isBlank())
            throw new IllegalArgumentException(field + " cannot be empty.");
        return value.trim();
    }

    public static String validateLogin(String login) {
        login = validateNonEmpty(login, "Login");
        if (login.length() < 3 || login.length() > 20)
            throw new IllegalArgumentException("Login must be between 3 and 20 characters.");
        return login;
    }

    public static String validateEmail(String email) {
        email = validateNonEmpty(email, "Email");
        if (!email.contains("@"))
            throw new IllegalArgumentException("Email must contain '@'.");
        return email;
    }

    public static double validateNonNegative(double value, String field) {
        if (value < 0)
            throw new IllegalArgumentException(field + " cannot be negative.");
        return value;
    }

    public static int validatePositiveInt(int value, String field) {
        if (value < 1)
            throw new IllegalArgumentException(field + " must be at least 1.");
        return value;
    }
}