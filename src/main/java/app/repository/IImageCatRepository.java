package app.repository;

import app.model.entity.ImageCat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IImageCatRepository extends JpaRepository<ImageCat, Integer> {
}
