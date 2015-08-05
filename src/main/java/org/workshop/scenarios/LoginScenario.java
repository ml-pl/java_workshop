package org.workshop.scenarios;

import org.workshop.model.Credentials;
import org.workshop.pages.LoginPage;
import org.workshop.pages.ProfilePage;

public class LoginScenario {

    private Credentials credentials;

    public LoginScenario(Credentials credentials) {
        this.credentials = credentials;
    }

    public ProfilePage login(LoginPage loginPage) {
        return loginPage.fillLogin(credentials.getLogin())
                .fillPassword(credentials.getPassword())
                .clickSubmit();
    }
}
