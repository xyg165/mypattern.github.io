package patterntype.principle;

public class User {

	private AbsBaseUserInfo absUser;//���࣬�����滻ԭ��
	
	
	public void setUser(AbsBaseUserInfo absUser) {
		this.absUser = absUser;
	}

	public void getMoney(){		
		absUser.stock();
		absUser.sell();
		System.out.println("��ʼ��Ǯ��");
	}
}
