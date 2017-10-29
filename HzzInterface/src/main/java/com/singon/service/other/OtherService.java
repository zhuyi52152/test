/**
 * 
 */
package com.singon.service.other;

import java.util.List;

import com.singon.model.other.TestOther;

/**
 * @author cavly
 *
 */
public interface OtherService {

	/**
	 * 获取所有other数据
	 * @return list<TestOther>
	 */
	public List<TestOther> getOthers();
	
	/**
	 * 根据id获取一个other数据
	 * @param id
	 * @return TestOther
	 */
	public TestOther getOtherUser(int id);

	
	/**
	 * 新增一个other数据
	 * @param other
	 */
	public void addOther(TestOther other);
	
	
}
