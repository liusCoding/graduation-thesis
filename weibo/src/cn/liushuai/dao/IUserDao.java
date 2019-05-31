package cn.liushuai.dao;


import java.util.List;

import cn.liushuai.common.bean.Conch;
import cn.liushuai.common.bean.PointAction;
import cn.liushuai.common.bean.PointRecord;
import cn.liushuai.common.bean.User;
import cn.liushuai.common.bean.WeiboComm;
import cn.liushuai.common.exception.DataAccessException;

public interface IUserDao {
	
	//通过邮箱地址查找用户名
	User findUserByEmail(String email) throws DataAccessException;
	
	//通过用户邮箱和密码查找用户
	User findUserByEmailAndPassword(String email,String password) throws DataAccessException;
	
	//通过昵称查找用户
	User findUserByNickName(String nickName) throws DataAccessException;
	
	//通过用户id查找用户
	User findUserById(Long id) throws DataAccessException;
	
	//保存用户信息
	void saveUser(User user) throws DataAccessException;
	
	//查找操作所能获得的积分
	PointAction findIntegral(String operation) throws DataAccessException;
	
	//保存积分流水信息
	void savePointRecord(PointRecord record) throws DataAccessException;
	
	//通过评论id获取评论人id
	long findUserIdByCommId(long commId) throws DataAccessException;
	
	//修改用户问答积分
	void saveConchIntegral(User user) throws DataAccessException;
	
	//更改用户信息
	void updateUser(User user) throws DataAccessException;
	
	//更改用户信息(关注数，粉丝数，微博数，收藏数变化)
	void updateUserForNum(User user) throws DataAccessException;
	
	//用户发布问答问题
	void saveConch(Conch conch) throws DataAccessException;
	
	//查找问答by最新
	List<Conch> findConchByNews(int minPage,int maxPage) throws DataAccessException;
	int findConchByNewsNum()throws DataAccessException;
	
	//查找问答by是否解决
	List<Conch> findConchByState(int state,int minPage,int maxPage) throws DataAccessException;
	int findConchByStateNum(int state) throws DataAccessException;
	
	//查找我的问答消息
	List<Conch> findConchByMe(long id,int minPage,int maxPage) throws DataAccessException;
	int findConchByMeNum(long id) throws DataAccessException;
	
	//通过问答id查找问答
	Conch findConchById(long conchId)throws DataAccessException;
	
	//设置问答状态为1
	void setConchState(long conchId)throws DataAccessException;
	
	//设置问答评论状态为101
	void setConchComm(long commId) throws DataAccessException;
	
	//查看用户是否被封禁
	User findFJUser(long uId) throws DataAccessException;
}
