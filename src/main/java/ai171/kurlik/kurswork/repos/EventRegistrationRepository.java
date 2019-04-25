package ai171.kurlik.kurswork.repos;

import ai171.kurlik.kurswork.Entitys.Event;
import ai171.kurlik.kurswork.Entitys.EventRegistration;
import ai171.kurlik.kurswork.Entitys.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRegistrationRepository extends JpaRepository<EventRegistration, Integer> {
    List<EventRegistration> findAllByUser(User user);
    List<EventRegistration> findAllByEvent(Event event);
}
