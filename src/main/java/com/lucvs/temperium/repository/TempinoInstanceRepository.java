package com.lucvs.temperium.repository;

import com.lucvs.temperium.dto.TempinoInstance;
import com.lucvs.temperium.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TempinoInstanceRepository extends JpaRepository<TempinoInstance, Long> {

    List<TempinoInstance> user(User user);
    Optional<TempinoInstance> findByUserId(Long userId);
    Optional<TempinoInstance> findByNickname(String nickname);
}
