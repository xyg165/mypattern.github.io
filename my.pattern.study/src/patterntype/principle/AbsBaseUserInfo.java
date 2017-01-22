package patterntype.principle;

/**
 * @Description:人员的两个基本行为
 * @author xyg 2017-1-22
 * @email  xyg165@126.com
 * @version 1.0
 */
public abstract class AbsBaseUserInfo {

	/**
	 * @Description:人员进货
	 * @return void:
	 * @exception 
	 * @author xyg @date 2017-1-22
	 * @version 1.0
	 */
	public abstract void stock();
	
	/**
	 * @Description:人员卖货
	 * @return void:
	 * @exception 
	 * @author xyg @date 2017-1-22
	 * @version 
	 */
	public abstract void sell();
}
