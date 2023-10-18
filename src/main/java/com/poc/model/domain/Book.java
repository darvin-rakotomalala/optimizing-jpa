package com.poc.model.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "book", indexes = @Index(name = "author_id_index", columnList = "author_id"))
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String isbn;

    @ManyToOne(fetch = FetchType.EAGER) // Eager fetch strategy
    @JoinColumn(name = "author_id")
    private Author author;
}
