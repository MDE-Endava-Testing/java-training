package logininterface;

public class TestLogin {


    //Without Interface
    public static void testAndroidLogin(AndroidLogin a ){
        a.login();
    }

    public static void testIosLogin(IosLogin i ){
        i.login();
    }

    public static void testWebLogin(WebLogin w){
        w.login();
    }



    //Implementing interface Login
    public static void testLogin(Login l){
        l.login();
    }

    public static void main(String[] args) {
        AndroidLogin a = new AndroidLogin();
        IosLogin i = new IosLogin();
        WebLogin w = new WebLogin();









        //Login l = () ->();
        //without
        testAndroidLogin(a);
        testIosLogin(i);
        testWebLogin(w);

//        Login l = new IosLogin();
//
//        //with interface
//        testLogin(a);
//        testLogin(i);
//        testLogin(w);
//        testLogin(l);

    }

}
