package com.brainmentors.apps.dao;

import static com.brainmentors.apps.utils.MessageConstants.FAIL;
import static com.brainmentors.apps.utils.SQLConstants.USER_LOGIN_SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.brainmentors.apps.dto.GroupDTO;
import com.brainmentors.apps.dto.MessageDTO;
import com.brainmentors.apps.dto.RightDTO;
import com.brainmentors.apps.dto.RoleDTO;
import com.brainmentors.apps.dto.UserDTO;

public class UserDAO {
	public UserDTO doLogin(UserDTO userDTO) throws SQLException, ClassNotFoundException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MessageDTO messageDTO = null;
		ArrayList<RightDTO> rightList = new ArrayList<>();
		ArrayList<RoleDTO> roleList = new ArrayList<>();
		RoleDTO roleDTO = null;
		GroupDTO groupDTO = null;
		UserDTO userDTOObject = null;
		boolean isFound = false;
		try{
			con = CommonDAO.getConnection();
			pstmt = con.prepareStatement(USER_LOGIN_SQL);
			pstmt.setString(1, userDTO.getUserid());
			pstmt.setString(2, userDTO.getPwd() );
			rs = pstmt.executeQuery();
			while(rs.next()){
				//RightDTO rightDTO = new RightDTO(rs.getString("rightname"));
				rightList.add(new RightDTO(rs.getString("rightname"),rs.getString("screen")));
				roleDTO = new RoleDTO(rs.getString("rolename"));
				roleList.add(roleDTO);
				if(groupDTO==null){
				groupDTO = new GroupDTO(rs.getString("gname"));
				}
				if(userDTOObject==null){
				userDTOObject = new UserDTO();
				userDTOObject.setUserid(rs.getString("userid"));
				}
//				messageDTO  = new MessageDTO();
//				messageDTO.setMessage("Welcome "+userDTO.getUserid());
//				messageDTO.setStatus(SUCCESS);
				isFound = true;
			}
			if(userDTOObject!=null){
				userDTOObject.setGroupDTO(groupDTO);
				userDTOObject.getGroupDTO().setRoleList(roleList);
				userDTOObject.getGroupDTO().getRoleList().get(0).setRightList(rightList);
			}
//			if(!isFound){
//				messageDTO  = new MessageDTO();
//				messageDTO.setMessage("Invalid Userid or Password");
//				messageDTO.setStatus(FAIL);
//			}
			return userDTOObject;
		}
		finally{
			if(rs!=null){
				rs.close();
			}
			if(pstmt!=null){
				pstmt.close();
			}
			if(con!=null){
				con.close();
			}
		}
		
	}

}
