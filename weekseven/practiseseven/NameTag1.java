package stepclass3rdsem.weekseven.practiseseven;
class NameTag {
    private final String firstName;
    private final String lastName;

    NameTag(String fullName) {
        String[] parts = fullName.split(" ");
        this.firstName = parts[0];
        this.lastName = parts[1];
    }

    String getNickname() {
        return firstName + " " + lastName.charAt(0) + ".";
    }
}

public class NameTag1 {
    public static void main(String[] args) {
        NameTag tag = new NameTag("Maria Gomez");
        System.out.println("Nickname: " + tag.getNickname());
    }
}


