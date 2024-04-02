package rocketseat.com.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rocketseat.com.passin.domain.attendee.Attendee;

@Repository
public interface AttendeeRepository extends JpaRepository<Attendee, String> {
}
