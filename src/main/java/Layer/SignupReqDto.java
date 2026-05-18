package Layer;

//dto: data transfer object 데이터를 주고 받을 때 쓰는 객체
public class SignupReqDto {
    private String username;
    private String password;


    //dto --> entity
    public User toUser() {
        return new User(this.username, this.password);
    }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

    public SignupReqDto(String username, String password) {
        //검증 로직
        this.username = username;
        this.password = password;
    }
}

