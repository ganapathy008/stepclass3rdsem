package stepclass3rdsem.weekseven;
class PasswordChecker {
    private final String password;

    PasswordChecker(String password) {
        this.password = password;
    }

    String getStrength() {
        int len = password.length();
        if (len < 6) return "Weak";
        else if (len <= 9) return "Medium";
        else return "Strong";
    }
}

public class PasswordChecker1 {
    public static void main(String[] args) {
        PasswordChecker pc1 = new PasswordChecker("abcd");
        System.out.println("Strength: " + pc1.getStrength());

        PasswordChecker pc2 = new PasswordChecker("abcdefghij");
        System.out.println("Strength: " + pc2.getStrength());
    }
}


