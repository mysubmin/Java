package j19_익명클래스.role;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class PrincipalDetailes {

//	public static void main(String[] args) {
//		String strRoles = "USER_ROLE, ADMIN_ROLE,MANAGE_ROLE";
//		/*
//		 * strRoles를 숨표단위로 잘라서
//		 * roleArray라는 배열에 넣고
//		 * roleArray배열을 foreach 돌리고 출력하고
//		 * roleArray를 roles에 넣기
//		 */
//		
////		strRoles = strRoles.replaceAll(" ", "");
////		
////		String[] rolesArray = strRoles.split(",");
//		
//		String[] rolesArray = strRoles.replaceAll(" ", "").split(",");
//		
//		for(String role : rolesArray) {
//			System.out.println(role);
//		}
//		
//		List<String> roles = new ArrayList<String>();
//		
//		roles.addAll(Arrays.asList(rolesArray));
//		
//		System.out.println();
//		System.out.println(roles);
//		
//		Collection<String> roleDates = new GrantedAuthority() {
//			
//			@Override
//			public Collection<String> getRoles(List<String> rolse) {
//				List<String> roleList = new ArrayList<String>();
//				roleList.addAll(roles);
//				return roleList;
//			}
//		}.getRoles(roles);
//		
//		System.out.println(roleDates);
//		
//		
//	}
	
	@NonNull
	private User user;
	
	public Collection<? extends GrantedAuthority> getAuthorities(){
		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		user.getRoleList().forEach(r ->{
			authorities.add(() -> r);
		});
		return authorities;
	}
	
	public String getUsername() {
		return user.getUsername();
	}
	
	public String getPassword() {
		return user.getPassword();
	}
	

}
