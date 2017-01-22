package patterntype.principle;

/**
 * @Description:管理人员
 * @author xyg 2017-1-22
 * @email  xyg165@126.com
 * @version 1.0
 */
public class UserManager extends AbsBaseUserInfo {

	@Override
	public void stock() {
		System.out.println("管理员进货！");
	}

	@Override
	public void sell() {
		System.out.println("管理员卖货！");
	}

}
