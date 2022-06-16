package in.crudjpaoracle.crudjpaoracle.reposirty;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.crudjpaoracle.crudjpaoracle.models.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
	
	List<Tutorial> findByPublished(boolean published);
	  List<Tutorial> findByTitleContaining(String title);
	
}
