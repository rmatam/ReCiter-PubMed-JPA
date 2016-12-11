package reciter.database.mongo.repository;

import java.util.List;

import reciter.database.mongo.model.PubMedArticleMongo;

public interface PubMedRepositoryCustom {
	List<PubMedArticleMongo> findMatchingAuthorsByLastName(String lastName);
}
