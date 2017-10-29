/**
 * 
 */
package com.singon.service.imp.other;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.singon.dao.other.OtherDao;
import com.singon.model.other.TestOther;
import com.singon.service.other.OtherService;

/**
 * @author cavly
 *
 */
@Service
@com.alibaba.dubbo.config.annotation.Service(version="1.0")
public class OtherServiceImp implements OtherService {

	@Resource
	private OtherDao otherDao;

	public List<TestOther> getOthers(){
		
		return this.otherDao.getOthers();
	}
	
	public TestOther getOtherUser(int id){
		
		return this.otherDao.getUser(id);
	}

	public void addOther(TestOther other) {
		
		this.otherDao.addOther(other);
	}
	
	

}
