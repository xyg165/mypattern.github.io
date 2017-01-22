package patterntype.principle;

/**
 * @Description:销售人员
 * @author xyg 2017-1-22
 * @email  xyg165@126.com
 * @version 1.0
 */
public class UserSale extends AbsBaseUserInfo {

	@Override
	public void stock() {
		System.out.println("销售人员进货！");
	}

	@Override
	public void sell() {
		System.out.println("销售人员卖货");
	}

}
