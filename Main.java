public class Main {
    public static void main(String[] args) {
        SecurityCode code = new SecurityCode();
        LoginPage page = new LoginPage(SecurityCode.getLogininfo());
    }
}
