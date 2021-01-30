package loginSystem;

import java.util.HashMap;

public class LoginInfo {

    HashMap<String, String> userdata = new HashMap<String, String>();

    LoginInfo() {
        userdata = new HashMap<String, String>();
        userdata.put("suhas", "abc");
        userdata.put("goku", "abcd");
        userdata.put("gokusan", "abcde");
    }

    protected HashMap getData() {
        return userdata;
    }
}
