import com.example.tpeducation.entities.Enseignant;
import com.example.tpeducation.services.EnseingantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("clients")
public class EnseignantController {
    @Autowired
    private EnseingantServiceImpl enseingantService;

    @GetMapping("/enseignants")
    public List<Enseignant> getEnseignant(){
        return enseingantService.retrieveAllEnseigants();
    }
}
