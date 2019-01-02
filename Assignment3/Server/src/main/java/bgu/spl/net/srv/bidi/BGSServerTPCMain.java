package bgu.spl.net.srv.bidi;
import bgu.spl.net.api.bidi.BGSProtocol;
import bgu.spl.net.api.bidi.LineMessageEncoderDecoder;


public class BGSServerTPCMain {

	public static void main(String[] args) {
		Server.threadPerClient(
				 7777,
				 () ->  new BGSProtocol(),
				 () ->  new LineMessageEncoderDecoder()
				 ).serve();

	}
}

