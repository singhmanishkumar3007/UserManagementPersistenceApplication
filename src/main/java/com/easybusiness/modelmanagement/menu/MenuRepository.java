package com.easybusiness.modelmanagement.menu;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.easybusiness.modelmanagement.entity.Menu;

public interface MenuRepository extends CrudRepository<Menu, Long>,MenuCustomRepository {

    List<Menu> findById(Long i);

    List<Menu> findByMenuName(String menuName);

    // custom query example and return a stream
    @Query("select m from Menu m where m.menuName = :menuName")
    Stream<Menu> findByMenuNameReturnStream(@Param("menuName") String menuName);

    

}
