package rocketseat.com.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rocketseat.com.passin.domain.checkin.Checkin;

import java.util.Optional;

@Repository
public interface CheckinRepository extends JpaRepository<Checkin, Integer> {
    Optional<Checkin> findByAttendeeId(String attendeeId);
}
