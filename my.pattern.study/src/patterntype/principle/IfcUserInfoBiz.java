package patterntype.principle;

/**
 * @Description:用户行为接口
 * @author xyg 2017-1-22
 * @email  xyg165@126.com
 * @version 1.0
 */
public interface IfcUserInfoBiz {

	void changeUserName(String userName);
	boolean deleteUser(String userID);
	boolean addOrg(int orgID);
	boolean addRole(int roleID);
	void mapUser();
	boolean changePassword(String userID);
}
