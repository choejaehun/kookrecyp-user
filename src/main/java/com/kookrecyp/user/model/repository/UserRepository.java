package com.kookrecyp.user.model.repository;

//import com.kookrecyp.user.model.domain.UserModel;
import com.kookrecyp.user.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * packageName : com.kookrecyp.user.model.repository
 * fileName    : UserRepository
 * author      : jaejun
 * date        : 2024-08-23
 * description :
 * ===================================================
 * DATE             AUTHOR              NOTE
 * ---------------------------------------------------
 * 2024-08-23         jaejun
 */

@Repository
public interface UserRepository extends JpaRepository <UserEntity, Long> {

//    Map<?,?> login(UserModel model);
}
