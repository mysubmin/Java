package j12_다형성2;

public class MessengerMain {

	public static void main(String[] args) {
		FacebookMassenger facebookMassenger = new FacebookMassenger();
		KakaoTalk kakaoTalk = new KakaoTalk();
		Messenger messenger = facebookMassenger; 
		
		MessengerMiddleware  messengerMiddleware = new MessengerMiddleware(messenger);
		
		messengerMiddleware.sendMessenger();
		System.out.println("메세지 전송 완료");
		System.out.println();
		
		messengerMiddleware.recevieMessenger();
		System.out.println("새로운 메세지를 받음");
		System.out.println();
		
		
		
		 messengerMiddleware.runAddsOns();

	}

}
