package org.example.StepDefinitions;

public class SharedMethods {

    public static void loginSteps(String email, String password) throws InterruptedException {
    D02_LoginDef.navigate_to_loginPAge();
    D02_LoginDef.enter_valid_data(email, password);
    D02_LoginDef.clickLoginButton();
    Thread.sleep(2000);
}


    public static void Search_for_Product(String product){
        D04_SearchDef.Search_Product(product);
        D04_SearchDef.clickSearch_btn();
    }
}
