abstract public class Account {
	
	protected int id;
	protected String name;
	private Task myTask;

	public void performOperation(Task _myTask){
		myTask = _myTask;
		myTask.execute();
	}
}
