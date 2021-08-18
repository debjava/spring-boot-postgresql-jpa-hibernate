package com.ddlab.rnd.repository.one2many1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends JpaRepository< Post, Long> {

}
