package asia.gtalent.webservice.service.impl;

import asia.gtalent.webservice.dao.GroupDao;
import asia.gtalent.webservice.dao.UserGroupDao;
import asia.gtalent.webservice.model.Group;
import asia.gtalent.webservice.service.UserGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserGroupServiceImpl implements UserGroupService {

    @Autowired
    private UserGroupDao userGroupDao;

    @Autowired
    private GroupDao groupDao;

    @Override
    @Transactional
    public void updateGroupModule(String userId, String groupId) throws Exception {
        if(!groupDao.existsById(groupId))
            throw new Exception();
        if(userGroupDao.updateUserGroup(userId,groupId) == 0)
            throw new Exception();
    }
}
