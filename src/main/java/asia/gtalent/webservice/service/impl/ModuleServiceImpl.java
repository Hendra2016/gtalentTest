package asia.gtalent.webservice.service.impl;

import asia.gtalent.webservice.dao.ModuleDao;
import asia.gtalent.webservice.model.Module;
import asia.gtalent.webservice.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ModuleServiceImpl implements ModuleService {
    @Autowired
    private ModuleDao moduleDao;
    @Override
    public List getAllModuleByUser(String userId) {
        return moduleDao.getAllByUserId(userId);
    }
}
