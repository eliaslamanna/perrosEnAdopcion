package app.service;

import app.mapper.ItemMapper;
import app.model.dto.ItemDTO;
import app.model.dto.PostulantesDTO;
import app.model.entity.MyDogs;
import app.model.entity.Usuario;
import app.repository.IAdoptantsDogRepository;
import app.repository.IMyDogsRepository;
import app.repository.IPerrosRepository;
import app.repository.IUsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyDogsService extends  MyPetsCommonService<IMyDogsRepository, IPerrosRepository, IAdoptantsDogRepository, MyDogs> implements IMyDogsService {

    @Override
    public List<ItemDTO> getMyDogs(String username) {
        return getMyPets(username);
    }

    @Override
    public void addToMyDogs(int idDog, String username) throws Exception {
        addToMyPets(idDog, username, MyDogs.class);
    }

    @Override
    public List<PostulantesDTO> getAdoptantsDog(int idDog) {
        return getPostulantesPet(idDog);
    }
}
