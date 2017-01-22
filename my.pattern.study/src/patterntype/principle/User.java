package patterntype.principle;

public class User {

	private AbsBaseUserInfo absUser;//父类，里氏替换原则
	
	
	public void setUser(AbsBaseUserInfo absUser) {
		this.absUser = absUser;
	}

	public void getMoney(){		
		absUser.stock();
		absUser.sell();
		System.out.println("开始数钱！");
	}
}
