package j19_익명클래스.role;

public class PrincipalMain {

	public static void main(String[] args) {
		User user = User.builder()
					.username("hong")
					.password("1234")
					.roles("USER_ROLE, ADMIN_ROLE,MANAGE_ROLE")
					.build();
		
		User user2 = User.builder()
					.username("yeonho")
					.password("1234")
					.roles("USER_ROLE")
					.build();
		
		PrincipalDetailes principalDetailes = new PrincipalDetailes(user);
		PrincipalDetailes principalDetailes2 = new PrincipalDetailes(user2);
		
		printPrincipalData(principalDetailes);
		printPrincipalData(principalDetailes2);

	}
	public static void printPrincipalData(PrincipalDetailes principalDetailes) {
		System.out.println("[principal 정보출력]");
		System.out.println("username : " + principalDetailes.getUsername());
		System.out.println("password : " + principalDetailes.getPassword());
		
		for(GrantedAuthority grantedAuthority : principalDetailes.getAuthorities()) {
			System.out.println("관한 : " + grantedAuthority.getAuthority());
		}
	}

}
