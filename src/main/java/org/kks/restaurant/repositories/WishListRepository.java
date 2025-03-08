package org.kks.restaurant.repositories;

import org.kks.restaurant.entities.WishList;
import org.kks.restaurant.entities.WishListId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface WishListRepository extends JpaRepository<WishList, WishListId>, QuerydslPredicateExecutor<WishList> {

}