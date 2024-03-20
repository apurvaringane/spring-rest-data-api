package org.jspiders.springrestdataapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private int bookId;
    @Column(name = "book_title")
    private String bookTitle;
    @Column(name = "book_price")
    private double bookPrice;

    @ManyToMany(cascade = CascadeType.ALL)
            @JoinTable(
                    name = "book_author",
                    joinColumns = @JoinColumn(name = "book_ref"),
                    inverseJoinColumns = @JoinColumn(name = "author_ref")
            )

    private List<Author> authorList;

}
