package app.repository;

import app.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUsuariosRepository extends JpaRepository<Usuario, String> {
}
