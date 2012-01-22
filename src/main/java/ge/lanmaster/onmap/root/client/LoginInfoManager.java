package ge.lanmaster.onmap.root.client;

/**
 * Created by IntelliJ IDEA.
 * User: alexander
 * Date: 1/12/12
 * Time: 5:07 AM
 * To change this template use File | Settings | File Templates.
 */
public class LoginInfoManager {
    private static LoginInfo loginInfo = new LoginInfo();


    public LoginInfo getLoginInfo() {
        return loginInfo;
    }

    public void setLoginInfo(LoginInfo loginInfo) {
        LoginInfoManager.loginInfo = loginInfo;
    }
}
