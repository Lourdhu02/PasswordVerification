import java.util.HashMap;

class SecurityCode {

    static HashMap<String, String> logininfo = new HashMap<String, String>();

    SecurityCode() {
        logininfo.put("prasanna", "prasanna24");
        logininfo.put("b.lourdhuraju1234@gmail.com", "kingraju12345. ");
        logininfo.put("susmitha", "Itachi");
        logininfo.put("praveen", "wasted");
        logininfo.put("manoj", "balayya2002");

    }

    protected static HashMap getLogininfo() {
        return logininfo;
    }
}
