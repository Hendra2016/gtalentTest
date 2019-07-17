package asia.gtalent.webservice.dao;

import asia.gtalent.webservice.model.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModuleDao extends JpaRepository<Module,String> {

    @Query("select a from Module a, UserGroup b where b.userId=:userId and b.groupId=a.groupId")
    public List<Module> getAllByUserId(@Param("userId") String userId);
}
