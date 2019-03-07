package cn.liushuai.service;

import java.util.List;
import java.util.Map;

import cn.liushuai.common.bean.Message;
import cn.liushuai.common.bean.User;
import cn.liushuai.common.bean.Weibo;
import cn.liushuai.common.exception.FriendServiceException;
import cn.liushuai.common.util.PageBean;

public interface IFriendService {
	
	//查找用户关注用户最近更新的微博
	List<Weibo> findFriendWeibo(long uId,PageBean page) throws FriendServiceException;
	
	//查找关注用户
	List<User> findAttUser(long uId, PageBean page) throws FriendServiceException;
	
	//查找用户关注数
	int findAttUserNum(long uId) throws FriendServiceException;
	
	//查看粉丝用户数量
	int findFansNum(long uId) throws FriendServiceException;
	
	//查找粉丝用户
	List<User> findFansUser(long uId, PageBean page) throws FriendServiceException;
	
	//查找用户关注微博数量
	int findWeiboNumber(long uId) throws FriendServiceException;

	//查找私信用户和私信内容
	Map<String, Object> findMessageById(long aId,long bId) throws FriendServiceException;

	//用户发送私信
	void sendMessage(Message message) throws FriendServiceException;
	
	//查找用户黑名单数
	int findBlackNum(long uId) throws FriendServiceException;
	
	//查找用户拉黑用户
	List<User> findBlackUser(long uId,PageBean page) throws FriendServiceException;
} 
