package parking;

/**
 * Created by Master on 14.07.2016.
 */
public class TestConstClient {
    public static void main(String[] args) {
        Area area = new Area();
        ConstantClient constantClient = new ConstantClient();
        constantClient.addConstantClient();
        constantClient.showListConstClient(constantClient.toStringCC(constantClient));

    }
}
