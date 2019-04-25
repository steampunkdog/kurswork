package ai171.kurlik.kurswork.repos;

import ai171.kurlik.kurswork.Entitys.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DishRepository extends JpaRepository<Dish, Integer> {
}
