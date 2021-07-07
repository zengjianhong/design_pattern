package _16visitor;

/**
 * @author jehon
 */
public class Client {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        Success success = new Success();
        objectStructure.display(success);

        System.out.println("=============================");

        Fail fail = new Fail();
        objectStructure.display(fail);

        System.out.println("========给的是待定的测评==========");
        Wait wait = new Wait();
        objectStructure.display(wait);
    }
}
