package patterntype.principle;

/**
 * @Description:������Ա
 * @author xyg 2017-1-22
 * @email  xyg165@126.com
 * @version 1.0
 */
public class UserSale extends AbsBaseUserInfo {

	@Override
	public void stock() {
		System.out.println("������Ա������");
	}

	@Override
	public void sell() {
		System.out.println("������Ա����");
	}

}
