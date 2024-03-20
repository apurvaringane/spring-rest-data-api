package org.jspiders.springrestdataapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")
    private int authorId;
    @Column(name = "author_name")
    private String authorName;
    @Column(name = "author_age")
    private int authorAge;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "book_author",
            joinColumns = @JoinColumn(name = "author_ref"),
            inverseJoinColumns = @JoinColumn(name = "book_ref")
    )
    List<Book> bookList=new ArrayList<>();
}
