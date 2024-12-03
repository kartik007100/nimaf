package com.newproject.New.Spring.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.newproject.New.Spring.Project.Category.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
