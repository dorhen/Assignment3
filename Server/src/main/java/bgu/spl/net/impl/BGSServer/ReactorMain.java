package bgu.spl.net.impl.BGSServer;
import bgu.spl.net.srv.bidi.Server;
import bgu.spl.net.api.bidi.BGSProtocol;
import bgu.spl.net.api.bidi.LineMessageEncoderDecoder;
import bgu.spl.net.api.bidi.UsersInfo;

public class ReactorMain {

	public static void main(String[] args) {
		UsersInfo usersInfo = new UsersInfo();
		Server.reactor(
				 Integer.parseInt(args[1]),
				 Integer.parseInt(args[0]),
				 () ->  new BGSProtocol(usersInfo),
				 () ->  new LineMessageEncoderDecoder()
				 ).serve();

	}
	

}
