package patterntype.principle;

/**
 * @Description:1.��һְ��ԭ��2.�����滻ԭ��3.��������ԭ��4.�ӿڸ���ԭ��5.�����ط���6.����ԭ��
 * 1.��һְ���û�ɾ���û���Ϣ����ɾ���û���Ϣ���û����Ծ����û����ԣ�����һ�����飻
 * 2.�����滻����Ҫ�����ڸ����࣬�и������ӣ�����δ���и����û����ÿ��ǵ����Ǹ������ӡ�
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
		/*��һְ��ԭ��*/
		ImpUserInfo impUinfo = new ImpUserInfo();
		impUinfo.setUserID("1314888");
		
		/*�����滻ԭ��*/
		/*����User�����Ͳ���֪���������ĸ�����Ա��������*/
		User user = new User();
		user.setUser(new UserManager());
		user.getMoney();
		user.setUser(new UserSale());
		user.getMoney();
	}

}
