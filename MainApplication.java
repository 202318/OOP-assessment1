public class MainApplication {

	public static void main(String[] args) {

		Admin curAdmin = new Admin(1001, "Joy", "Admin@J2025");

		Student curStudent = new Student(2002, "Michael");

		curAdmin.performOperation(new ApproveRegistration()); // Admin approves registration

		curStudent.performOperation(new ViewTranscript()); // Student views transcript
	}
}
