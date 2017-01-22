package patterntype.principle;

public class ImpUserInfo implements IfcUserInfoBiz, IfcUserInfoBo {

	@Override
	public void setUserID(String userID) {
		System.out.println("已修改用户ID："+userID);
	}

	@Override
	public void setUserName(String userID) {
	}

	@Override
	public void changeUserName(String userName) {
	}

	@Override
	public boolean deleteUser(String userID) {
		return false;
	}

	@Override
	public boolean addOrg(int orgID) {
		return false;
	}

	@Override
	public boolean addRole(int roleID) {
		return false;
	}

	@Override
	public void mapUser() {
	}

	@Override
	public boolean changePassword(String userID) {
		return false;
	}


}
