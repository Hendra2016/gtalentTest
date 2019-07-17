package asia.gtalent.webservice.dao;

import asia.gtalent.webservice.model.User;
import asia.gtalent.webservice.model.UserGroup;
import asia.gtalent.webservice.model.UserGroupPk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGroupDao extends JpaRepository<UserGroup, UserGroupPk> {
    @Modifying
    @Query("update UserGroup a set a.groupId=:groupId where a.userId=:userId")
    public int updateUserGroup(@Param("userId") String userId, @Param("groupId") String groupId);
}
