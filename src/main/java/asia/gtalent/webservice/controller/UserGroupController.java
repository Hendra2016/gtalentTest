package asia.gtalent.webservice.controller;

import asia.gtalent.webservice.dto.Response;
import asia.gtalent.webservice.service.ModuleService;
import asia.gtalent.webservice.service.UserGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserGroupController {

    @Autowired
    private UserGroupService userGroupService;

    // Seharusnya Post
    @RequestMapping(value = "update-group", method = RequestMethod.GET)
    @ResponseBody
    public Response updateGroup(@RequestParam("userId") String userId, @RequestParam("groupId") String groupId) {
        Response res = new Response();
        try {
            userGroupService.updateGroupModule(userId, groupId);
            res.setResponses("Berhasil Update");
        }catch(Exception e){
            res.setResponses("Gagal Update");
        }
        return res;
    }
}
