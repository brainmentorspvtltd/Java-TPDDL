package com.brainmentors.apps.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.brainmentors.apps.dto.MessageDTO;
import com.brainmentors.apps.dto.UserDTO;
import static com.brainmentors.apps.utils.MessageConstants.SUCCESS;
import static com.brainmentors.apps.utils.MessageConstants.FAIL;

import static com.brainmentors.apps.utils.SQLConstants.USER_LOGIN_SQL;

public class UserDAO {
	public MessageDTO doLogin(UserDTO userDTO) throws SQLException, ClassNotFoundException{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MessageDTO messageDTO = null;
		boolean isFound = false;
		try{
			con = CommonDAO.getConnection();
			pstmt = con.prepareStatement(USER_LOGIN_SQL);
			pstmt.setString(1, userDTO.getUserid());
			pstmt.setString(2, userDTO.getPwd() );
			rs = pstmt.executeQuery();
			if(rs.next()){
				messageDTO  = new MessageDTO();
				messageDTO.setMessage("Welcome "+userDTO.getUserid());
				messageDTO.setStatus(SUCCESS);
				isFound = true;
			}
			if(!isFound){
				messageDTO  = new MessageDTO();
				messageDTO.setMessage("Invalid Userid or Password");
				messageDTO.setStatus(FAIL);
			}
			return messageDTO;
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
