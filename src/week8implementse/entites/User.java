package week8implementse.entites;

/**
 * <pre>
 * This class represents a customer, it holds all of the data that the store needs to know about someone.
 * Whilst this information is not sufficient to place an order in real life, it is detailed enough to serve as a good learning example.
 * </pre>
 */
public class User {

    public int userId;
    public String name;
    public String username;
    public String password;
    public String verificationQuestion;
    public String answer;
    public String dob;
    public String phoneNumber;
    public String address;

    public User(int userId, String name, String username, String password, String verificationQuestion, String answer, String dob) {
        this.userId = userId;
        this.name = name;
        this.username = username;
        this.password = password;
        this.verificationQuestion = verificationQuestion;
        this.answer = answer;
        this.dob = dob;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerificationQuestion() {
        return verificationQuestion;
    }

    public void setVerificationQuestion(String verificationQuestion) {
        this.verificationQuestion = verificationQuestion;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

}
