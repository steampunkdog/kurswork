package ai171.kurlik.kurswork.repos;

import ai171.kurlik.kurswork.Entitys.EventComments;
import ai171.kurlik.kurswork.Entitys.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventCommentRepository extends JpaRepository<EventComments, Integer> {
    List<EventComments> findAllByUser(User user);
}
