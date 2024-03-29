package cn.sp;

import com.alibaba.fastjson.JSON;
import com.github.ship.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class UserServiceImpl implements UserService{

    private static  Logger logger = LoggerFactory.getLogger(UserService.class);


    @Override
    public ApiResult<User> getUser(Long id) {
        logger.info("现在是【3】号提供服务");
        User user = new User(1L,"XX",2,"www.aa.com");
        return ApiResult.success(user);
    }

    @Override
    public String getUserString(Long id) {
        logger.info("getUserString");
        User user = new User(1L,"XX",2,"www.aa.com");
        return JSON.toJSONString(ApiResult.success(user));
    }
}
