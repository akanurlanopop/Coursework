import java.sql.Date;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

import entities.Student;
import entities.Group;
import entities.AcademicDepartment;
import entities.Faculty;
import entities.Teacher;

public class DbInitializer {

	private static final String DB4OFILENAME = "db/db.yap";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// accessDb4o
		ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), DB4OFILENAME);
		try {
		    // do something with db4o
			
				Student Student = new Student();
				db.store(Student);
				Group Group = new Group();
				db.store(Group);
				AcademicDepartment AcademicDepartment = new AcademicDepartment();
				db.store(AcademicDepartment);
				Faculty Faculty = new Faculty();
				db.store(Faculty);
				Teacher Teacher = new Teacher();
				db.store(Teacher);
			
		} finally {
		    db.close();
		}
	}
}
