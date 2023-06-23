package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

//@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class Student2 {
	private final String name;
	private int age;	
	@NonNull
	private String Code;

}
