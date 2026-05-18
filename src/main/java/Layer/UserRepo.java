package Layer;

public interface UserRepo {
    User[] findAll() throws Exception;
    void saveAll(User[] users) throws Exception;
}
