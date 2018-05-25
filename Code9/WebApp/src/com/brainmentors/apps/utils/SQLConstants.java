package com.brainmentors.apps.utils;

public interface SQLConstants {
	//String USER_LOGIN_SQL = "select userid, pwd from users where userid=? and pwd=?";
	String USER_LOGIN_SQL = "select users.userid , role.name as 'rolename', rights.name as 'rightname' "
			+ ", groups.name as 'gname', rights.screen from users,role,rights,groups,user_group_mapping,group_role_mapping,role_right_mapping"
			+ " where users.user_id=user_group_mapping.user_id and groups.group_id=user_group_mapping.group_id and"
			+ " role.role_id=group_role_mapping.role_id and groups.group_id=group_role_mapping.group_id and"
			+ " rights.right_id=role_right_mapping.right_id and role.role_id=role_right_mapping.role_id and "
			+ "users.userid=? and users.pwd=?";
}
