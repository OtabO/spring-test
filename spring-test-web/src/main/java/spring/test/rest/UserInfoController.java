package spring.test.rest;

import org.springframework.web.bind.annotation.*;
import spring.test.domin.UserInfo;

/**
 * Created by zhangsx on 16/7/21.
 */
@RestController
@RequestMapping(value = "userInfo")
public class UserInfoController {
    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    @ResponseBody
    public UserInfo getUserName(@PathVariable int id){
        UserInfo userInfo = new UserInfo();
        userInfo.setAge(11);
        userInfo.setName("tom");
        return userInfo;
    }
}
