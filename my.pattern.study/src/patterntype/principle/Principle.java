package patterntype.principle;

/**
 * @Description:1.单一职责原则；2.里氏替换原则；3.依赖倒置原则；4.接口隔离原则；5.迪米特法则；6.开闭原则
 * 1.单一职责：用户删除用户信息就是删除用户信息，用户属性就是用户属性，制作一件事情；
 * 2.里氏替换：主要体现在父子类，有父必有子，有子未必有父，用户不用考虑到底是父还是子。
 * @author xyg 2017-1-20
 * @email  xyg165@126.com
 * @version 1.0
 */
public class Principle {

	/**
	 * @Description:
	 * @param args
	 * @return void:
	 * @exception 
	 * @author xyg @date 2017-1-20
	 * @version 
	 */
	public static void main(String[] args) {
		/*单一职责原则*/
		ImpUserInfo impUinfo = new ImpUserInfo();
		impUinfo.setUserID("1314888");
		
		/*里氏替换原则*/
		/*这里User根本就不用知道到底是哪个操作员来操作的*/
		User user = new User();
		user.setUser(new UserManager());
		user.getMoney();
		user.setUser(new UserSale());
		user.getMoney();
	}

}
