import model.Current;

public class App {
    public static void main(String[] args) throws Exception {
        Current cc = new Current();
        cc.setNumber("001");
        cc.withdraw(200);
        cc.extract();
    }
}
