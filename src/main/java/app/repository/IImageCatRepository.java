package app.repository;

import app.model.entity.PetImageCat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IImageCatRepository extends JpaRepository<PetImageCat, Integer> {
}
