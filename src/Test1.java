
public class Test1 {

	// �����û�id
	private int id;
	// �����û�������r
	private String username;
	// �����û�����
	private String password;
	// ����нˮ����
	private int salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Test1 [id=" + id + ", username=" + username + ", password=" + password + ", salary=" + salary + "]";
	}

	
}
