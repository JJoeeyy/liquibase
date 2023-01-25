package ch.bbw.m151.liquibasedemo.datamodel;

import java.time.OffsetDateTime;
import java.util.UUID;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

@Getter
@Setter
@Entity
@Table(name = "articles")
public class ArticleEntity {

    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid")
    private UUID id;

    @Column(nullable = false)
    String title;

    @Column(columnDefinition = "TEXT")
    String text;

    @CreationTimestamp
    private OffsetDateTime created;

    @Version
    private int version;

    @Column()
    int category;
}
