public class User {
    private final String firstName;
    private final String lastName;
    private final String login;
    private final String email;
    private double trustScore;

    private User(Builder b) {
        this.firstName  = b.firstName;
        this.lastName   = b.lastName;
        this.login      = b.login;
        this.email      = b.email;
        this.trustScore = b.trustScore;
    }

    public void addTrustPoint()    { trustScore++; }
    public void removeTrustPoint() { trustScore = Math.max(0, trustScore - 1); }

    public String getFirstName()  { return firstName; }
    public String getLastName()   { return lastName; }
    public String getLogin()      { return login; }
    public String getEmail()      { return email; }
    public double getTrustScore() { return trustScore; }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (@" + login + ", trust: " + trustScore + ")";
    }

    public static class Builder {
        private String firstName, lastName, login, email;
        private double trustScore = 0;

        public Builder firstName(String v)  { this.firstName  = InputValidation.validateNonEmpty(v, "First name");       return this; }
        public Builder lastName(String v)   { this.lastName   = InputValidation.validateNonEmpty(v, "Last name");        return this; }
        public Builder login(String v)      { this.login      = InputValidation.validateLogin(v);                        return this; }
        public Builder email(String v)      { this.email      = InputValidation.validateEmail(v);                        return this; }
        public Builder trustScore(double v) { this.trustScore = InputValidation.validateNonNegative(v, "Trust score");   return this; }

        public User build() {
            if (firstName == null || lastName == null || login == null || email == null)
                throw new IllegalStateException("firstName, lastName, login, and email are required.");
            return new User(this);
        }
    }
}