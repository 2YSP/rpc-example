package cn.sp;

import com.github.ship.client.generic.GenericService;
import com.github.ship.client.generic.GenericServiceFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/GenericTest")
public class GenericTestController {


    @GetMapping("/user")
    public String getUserString(@RequestParam("id") Long id) {
        //cn.sp.UserService.getUserString
        GenericService instance = GenericServiceFactory.getInstance("cn.sp.UserService");
        Object result = instance.$invoke("getUserString", new String[]{"java.lang.Long"}, new Object[]{id});
        return result.toString();
    }


    @GetMapping("")
    public String getUser(@RequestParam("id") Long id) {
        //cn.sp.UserService.getUserString
        GenericService instance = GenericServiceFactory.getInstance("cn.sp.UserService");
        Object result = instance.$invoke("getUser", new String[]{"java.lang.Long"}, new Object[]{id});
        return result.toString();
    }
}
