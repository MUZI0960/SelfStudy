package kr.or.ddit.dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import kr.or.ddit.vo.LprodVO;

public class LprodDao {
	
	private SqlMapClient client;
	
 public List<LprodVO> selectAll(){
	 List<LprodVO> list = null;
	 
	 try {
		list = client.queryForList("lprod.selectAll");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
	 return list;
	 
 }
}