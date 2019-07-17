package asia.gtalent.webservice.dao;

import asia.gtalent.webservice.model.Group;
import asia.gtalent.webservice.model.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupDao extends JpaRepository<Group,String> {
    @Query("select a from Group a where a.groupId=:groupId")
    public Group getGroupById(@Param("groupId") String groupId);
}
