package ai171.kurlik.kurswork.Entitys;

import ai171.kurlik.kurswork.Entitys.enums.DishType;
import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "dish")
public class Dish {
    @Id
    @Column(name = "iddish")
    private Integer iddish;

    @Column(name = "name")
    @NonNull
    private String name;

    @Column(name = "type")
    @NonNull
    @Enumerated(EnumType.STRING)
    private DishType type;

    @Column(name = "composition")
    @NonNull
    private String composition;

    @Column(name = "mark")
    @NonNull
    private int mark;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "creator")
    private User creator;

    public int getIddish() {
        return iddish;
    }

    public void setIddish(int iddish) {
        this.iddish = iddish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DishType getType() {
        return type;
    }

    public void setType(DishType type) {
        this.type = type;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }
}
