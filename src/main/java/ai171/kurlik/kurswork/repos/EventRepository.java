package ai171.kurlik.kurswork.repos;

import ai171.kurlik.kurswork.Entitys.Event;
import ai171.kurlik.kurswork.Entitys.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
    List<Event> findAllByUser(User user);
}