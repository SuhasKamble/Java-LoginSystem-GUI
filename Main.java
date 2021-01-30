package loginSystem;

import loginSystem.LoginPage;

class Main {
    public static void main(String[] args) {
        LoginInfo loginInfo = new LoginInfo();
        LoginPage loginPage = new LoginPage(loginInfo.getData());

    }
}