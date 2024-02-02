package builderPattern;
import java.util.*;

public class User {
    protected final String firstName;
    protected final String lastName;
    protected final String email;
    protected final List<String> userInfo;

    private User(UserInfoBuilder infoBuilder) {
        this.firstName = infoBuilder.firstName ;
        this.lastName = infoBuilder.lastName;
        this.userInfo = infoBuilder.userInfo;
        this.email = infoBuilder.email;
    }

    protected static class UserInfoBuilder {
        private String email;
        private String firstName;
        private String lastName;
        private List<String> userInfo;

        public User.UserInfoBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public User.UserInfoBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public User.UserInfoBuilder email (String email) {
            this.email = email;
            return this;
        }

        public UserInfoBuilder userInfo (List <String> userInfo) {
            this.userInfo = userInfo;
            return this;
        }

        public User build() {
            return new User(this);
        }


    }
}
