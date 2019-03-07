package cn.liushuai.service;

import java.util.List;
import java.util.Map;

import cn.liushuai.common.bean.Conch;
import cn.liushuai.common.bean.User;
import cn.liushuai.common.bean.Weibo;
import cn.liushuai.common.exception.UserServiceException;
import cn.liushuai.common.util.PageBean;

/** 
 * @author : 
 * @date 创建时间：2017年4月28日 上午10:10:49
 * @version 1.0 
 * @parameter 
 * @return 
 */
public interface IAdminService {
	
	User adminlogin(String name,String password) throws UserServiceException;
	
	Map<String, Object> indexDate() throws UserServiceException;
	
	List<User> userManage(PageBean page) throws UserServiceException; 
	
	List<User> userManageByKey(PageBean page,String key) throws UserServiceException; 
	
	void FJUser(long uId,int day) throws UserServiceException;

	void JFUser(long uId) throws UserServiceException;
	
	int findUserNum() throws UserServiceException;
	
	int findUserNum(String key) throws UserServiceException;
	
	int findWeiboNum(String key) throws UserServiceException;
	
	int findConchNum(String key) throws UserServiceException;
	
	List<Weibo> findWeibo(PageBean pageBean,String key) throws UserServiceException;
	
	List<Conch> findConch(PageBean pageBean,String key) throws UserServiceException;
	
	void UpWeibo(long wId,String ac) throws UserServiceException;
	
	void UpConch(long cId,String ac) throws UserServiceException;
}
