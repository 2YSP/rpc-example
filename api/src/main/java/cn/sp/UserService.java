package cn.sp;

public interface UserService {
    ApiResult<User> getUser(Long id);


    String getUserString(Long id);
}
