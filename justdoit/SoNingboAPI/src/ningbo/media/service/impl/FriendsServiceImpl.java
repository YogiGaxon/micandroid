package ningbo.media.service.impl;

import java.util.List;

import javax.annotation.Resource;

import ningbo.media.bean.Friends;
import ningbo.media.core.service.impl.BaseServiceImpl;
import ningbo.media.dao.FriendsDao;
import ningbo.media.service.FriendsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service("friendsService")
public class FriendsServiceImpl extends BaseServiceImpl<Friends, Integer>
		implements FriendsService {

	@Resource
	private FriendsDao friendsDao ;
	
	@Autowired
	public FriendsServiceImpl(@Qualifier("friendsDao") FriendsDao friendsDao) {
		super(friendsDao);
	}
	
	public boolean isExistsRelation(Integer userA,Integer userB){
		return friendsDao.isExistsRelation(userA, userB) ;
	}
	
	public Friends getRelationObject(Integer userA,Integer userB){
		return friendsDao.getRelationObject(userA, userB) ;
	}
	
	
	public List<Friends> getFriendsForUserId(Integer userId){
		return friendsDao.getFriendsForUserId(userId) ;
	}
}
