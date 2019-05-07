
public class Test1 {

	// 定义用户id
	private int id;
	// 定义用户名变量r
	private String username;
	// 定义用户密码
	private String password;
	// 定义薪水变量
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
