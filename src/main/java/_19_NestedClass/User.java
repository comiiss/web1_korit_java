package _19_NestedClass;


//User 클래스에 빌더 패턴을 적용시켜 주세요
public class User {
    private String username;
    private String password;

    public static class Builder {
        private String username;
        private String password;

        public static Builder builder() {
            return new Builder();
        }

        private User(Builder builder) {
            this.username = builder.username;
            this.password = builder.password;
        }
        public Builder username(String username) {
            this.username = username;
            return this;

        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public User build() {
            User u = new User(this);
            return u;
        }
    }
}
