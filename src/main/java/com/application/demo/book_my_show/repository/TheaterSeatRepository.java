package com.application.demo.book_my_show.repository;

import com.application.demo.book_my_show.entity.MovieEntity;
import com.application.demo.book_my_show.entity.TheaterSeatEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheaterSeatRepository extends JpaRepository<TheaterSeatEntity,Integer> {

    // complex query - find total theater seats that can be booked for a movie
    //select count(*) from book_my_show.theater_seats where theater_entity_id =
    //(select theater_entity_id from book_my_show.shows where id = 3 and theater_entity_id);
}
