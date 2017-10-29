/**
 * 
 */
package com.singon.dao.other;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

import com.singon.model.other.TestOther;


/**
 * @author cavly
 *
 */
@MapperScan
public interface OtherDao {

	@Select(" select * from test_other ")
	public List<TestOther> getOthers();
	
	public TestOther getUser(int id);

	@Insert(" insert into test_other(id, other_code, other_name, other_age) values('$(other.id)', '$(other.otherCode)','$(other.otherName)','$(other.otherAge)')")
	public void addOther(TestOther other);
}
