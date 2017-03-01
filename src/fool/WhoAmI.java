package fool;

/**
 * Created by Мастер on 27.02.2017.
 */

    import java.net.*;

    import static java.net.InetAddress.getByName;

public class WhoAmI {
        public static void main(String[] args) throws Exception {
            if (args.length != 1) {
                System.err.println("Usage: WhoAmI MachineName");
                System.exit(1);
            }
            InetAddress a = InetAddress.getByName(args[0]);
            System.out.println(a);
        }
    }

