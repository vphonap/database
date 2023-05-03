package demo.springboot.database.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
 
    @Autowired
    private InformationService infoService;

    @RequestMapping("/infos")
    public List<Info> getInfoList()
    {
        return infoService.getInfoList();
    }
    
    @RequestMapping("/infos/{param}")
    public Info getInfo(@PathVariable String param)
    {
        return infoService.getInfo(param);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/infos")
    public void addInfo(@RequestBody Info i)
    {
        infoService.addInfo(i);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/infos/{param}")
    public void updateInfo(@RequestBody Info i,@PathVariable String param)
    {
        infoService.updateInfo(i,param);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "infos/{param}")
    public void deleteInfo(@PathVariable String param)
    {
        infoService.deleteInfo(param);
    }
 }
