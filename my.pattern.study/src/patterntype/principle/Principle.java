package patterntype.principle;

/**
 * @Description:1.单一职责原则；2.里氏替换原则；3.依赖倒置原则；4.接口隔离原则；5.迪米特法则；6.开闭原则
 * 1.单一职责SRP：用户删除用户信息就是删除用户信息，用户属性就是用户属性，制作一件事情；
 * 2.里氏替换LSP：将子类替换父类而程序不需要修改。在实际项目中，每个子类对应不同的业务，使用父类作为参数，传递不同的子类来完成业务逻辑！
 * 3.依赖倒置原则：
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
		impUinfo.changeUserName("xyg");
		/*里氏替换原则*/
		/*父类参数，传递子类完成业务逻辑*/
		User user = new User();
		user.setUser(new UserManager());
		user.getMoney();
		user.setUser(new UserSale());
		user.getMoney();
	}

}
