import com.zm.mapper.UserMapper;
import com.zm.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userService = classPathXmlApplicationContext.getBean("userService", UserMapper.class);
        List<User> userList = userService.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
    }


}
