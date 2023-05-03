package demo.springboot.database.database;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class InformationService {

    @Autowired
    private InfoRepository infoRepository;

    private List<Info> infoList  = new ArrayList<>(Arrays.asList(new Info("Title","Abc","Description of title"),
    new Info("Cost","50","Cost of title"),
    new Info("Publisher","Pune","Description of Publisher")));
    
    public List<Info> getInfoList()
    {
        //return infoList;
        List<Info> lst = new ArrayList<>();
        infoRepository.findAll().forEach(infoList::add);
        return lst;
    }

    public Info getInfo(String param)
    {
        return infoList.stream().filter(p->p.getId().equals(param)).findFirst().get();
    }

    public void addInfo(Info i) {
        //infoList.add(i);
        infoRepository.save(i);
    }

    public void updateInfo(Info iobj, String param) {
        for(int i =0; i<infoList.size();++i)
        {
            Info in = infoList.get(i);
            if(in.getId().equals(param))
            {
                infoList.set(i,iobj);
                break;
            }
        }

    }

    public void deleteInfo(String param) {
        infoList.removeIf(p->p.getId().equals(param));
    }
}
