package bgu.spl.net.impl.BGSServer;
import bgu.spl.net.srv.bidi.Server;
import bgu.spl.net.api.bidi.BGSProtocol;
import bgu.spl.net.api.bidi.LineMessageEncoderDecoder;
import bgu.spl.net.api.bidi.UsersInfo;


public class TPCMain {

	public static void main(String[] args) {
		UsersInfo usersInfo = new UsersInfo();
		Server.threadPerClient(
				 Integer.parseInt(args[0]),
				 () ->  new BGSProtocol(usersInfo),
				 () ->  new LineMessageEncoderDecoder()
				 ).serve();

	}
}

