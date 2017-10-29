/**
 * 
 */
package com.singon.dao.testuser;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.singon.model.testuser.TestUser;

/**
 * @author cavly
 *
 */
@MapperScan
public interface TestUserDao {

	
	public List<TestUser> getUser(int id);
	
}
