package ai171.kurlik.kurswork.Entitys;

import javax.persistence.*;


@Entity
@Table(name = "event_registration")
public class EventRegistration {

    @Id
    @Column(name = "idevent_registration")
    private Integer idevent_registration;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "event")
    private Event event;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user")
    private User user;

    public int getIdevent_registration() {
        return idevent_registration;
    }

    public void setIdevent_registration(int idevent_registration) {
        this.idevent_registration = idevent_registration;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
