/**
 * 作为jwt token的用户信息封装（因为在token中可能不包含所有用户信息）
 */
package com.jichuangsi.school.user.model;

import com.jichuangsi.school.user.entity.UserInfo;

/**
 * @author huangjiajun
 *
 */
public class UserInfoForToken {
	private String userId;
	private String userNum;
	private String userName;
	private String classId;
	private long timeStamp;

	public UserInfoForToken(String userId, String userNum, String userName, String classId, long timeStamp) {
		this.userId = userId;
		this.userNum = userNum;
		this.userName = userName;
		this.classId = classId;
		this.timeStamp = timeStamp;
	}

	public static final UserInfoForToken getFromUserInfo(UserInfo userInfo) {
		return new UserInfoForToken(userInfo.getUserId(), userInfo.getUserNum(), userInfo.getUserName(),
				userInfo.getClassId(), System.currentTimeMillis());
	}

	public final String getUserId() {
		return userId;
	}

	public final void setUserId(String userId) {
		this.userId = userId;
	}

	public final String getUserNum() {
		return userNum;
	}

	public final void setUserNum(String userNum) {
		this.userNum = userNum;
	}

	public final String getUserName() {
		return userName;
	}

	public final void setUserName(String userName) {
		this.userName = userName;
	}

	public final String getClassId() {
		return classId;
	}

	public final void setClassId(String classId) {
		this.classId = classId;
	}

	public final long getTimeStamp() {
		return timeStamp;
	}

	public final void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

}
