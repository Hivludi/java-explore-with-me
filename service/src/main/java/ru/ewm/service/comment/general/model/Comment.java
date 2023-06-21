package ru.ewm.service.comment.general.model;

import lombok.*;
import ru.ewm.service.event.general.model.Event;
import ru.ewm.service.user.model.User;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "comments")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    private long id;

    @OneToOne(optional = false)
    @JoinColumn(name = "author_id")
    private User author;

    @ManyToOne(optional = false)
    @JoinColumn(name = "event_id")
    private Event event;

    @Column(nullable = false)
    private Timestamp createdOn;

    private Timestamp updatedOn;

    @Column(nullable = false)
    private String text;
}