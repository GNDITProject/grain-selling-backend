package com.prayasj.gndit.grainselling.repository;

import com.prayasj.gndit.grainselling.model.User;
import com.prayasj.gndit.grainselling.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Integer> {
  UserProfile findByUser(User user);
}
