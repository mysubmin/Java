package j12_다형성2;

public class MessengerMiddleware {

	private Messenger messenger;
	
	public MessengerMiddleware(Messenger messenger) {
		this.messenger = messenger;
	}
	
	public void sendMessenger() {
		messenger.send();
	}
	
	public void recevieMessenger() {
		messenger.send();
	}

	public void runAddsOns() {
		System.out.println("추가 기능 실행");
		
		if(messenger instanceof KakaoTalk) {
			KakaoTalk kakaoTalk = (KakaoTalk)messenger;
			kakaoTalk.sendPresent();
		}else if(messenger instanceof FacebookMassenger) {
			FacebookMassenger facebookMassenger = (FacebookMassenger)messenger;
			facebookMassenger.call();
		}
	}
	
}