package com.exa.uas.entity
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.Table
import javax.persistence.GenerationType
import javax.persistence.Column

@Entity
@Table(name = "books")
class Book {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 Integer id
 @Column(nullable = false)
 String name
}
