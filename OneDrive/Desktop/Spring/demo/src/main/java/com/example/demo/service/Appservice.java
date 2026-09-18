package com.example.demo.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Repo.AppRepo;
import com.example.demo.model.AppModel;
import java.util.List;
@Service
public class AppService {
    @Autowired 
    AppRepo repository;
    public AppModel create(AppModel take1){
        return repository.save(take1);
    }
    public List<AppModel> getAll(){
        return repository.findAll();
    }
    public AppModel getById(long id) {
        return repository.findById(id).orElse(null);
    }
    public AppModel updateById(Long id ,AppModel table) {
        AppModel Model= repository.findById(id).orElse(null);
        if (Model != null) {
            Model.setName(table.getName());
            Model.setPhone(table.getPhone());
        }
        return repository.save(Model);
    }
    public String deleteById(Long id) {
        AppModel Model= repository.findById(id).orElse(null);
        if (Model == null) {
             repository.deleteById(id);
            return "Deleted Successfully";
        }
        return "id not found";
    }
}  