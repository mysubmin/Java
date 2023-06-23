package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
//@Setter
//@Getter
//@EqualsAndHashCode
//@ToString

public class Student {
	private int studentCode;
	private String name;
	private int studentYear;
	private int age;

}
