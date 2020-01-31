package Junit01312020;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
public class Controller {

    @Autowired repo repo1;


@PostMapping("/newEntry")
public Form createForm(@RequestBody Form form){

    return repo1.save(form);
}


    @GetMapping("/getAll")
    public List<Form> allRegistered(){
        return repo1.findAll();
    }


}
