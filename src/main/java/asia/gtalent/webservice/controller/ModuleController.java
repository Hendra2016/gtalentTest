package asia.gtalent.webservice.controller;

import asia.gtalent.webservice.dto.Response;
import asia.gtalent.webservice.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ModuleController {

    @Autowired
    private ModuleService moduleService;

    @RequestMapping(value="by-user",method = RequestMethod.GET)
    @ResponseBody
    public Response getBusinessByUser(@RequestParam("userId") String userId) {
        Response res = new Response();
        res.setResponses(moduleService.getAllModuleByUser(userId));
        return res;
    }
}
