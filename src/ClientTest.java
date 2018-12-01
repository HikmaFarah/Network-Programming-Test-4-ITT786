import javax.swing.JFrame;

public class ClientTest {
	public static void main(String[] args) {
		Client Hikma;
		Hikma = new Client("127.0.0.1");
		Hikma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Hikma.startRunning();
	}
}