package Junit01312020;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/people")
public class Controller {

    @Autowired repo repo1;





    @GetMapping("/getAll")
    public List<Form> allRegistered(){
        return repo1.findAll();
    }


}
