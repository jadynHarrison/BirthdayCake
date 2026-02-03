package cs301.birthdaycake;

public class CakeController {
    private CakeView cakeViewInstance;
    private CakeModel cakeModelInstance;

    public CakeController(CakeView expectCakeView) {
        cakeViewInstance = expectCakeView;
        cakeModelInstance = cakeViewInstance.grantReferenceAccess();
    }

}
