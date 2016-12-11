package reciter.database.mongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import reciter.model.pubmed.PubMedArticle;

@Document(collection="pubmedarticlemongo")
public class PubMedArticleMongo {

	@Id
	private String id;
	
	private PubMedArticle pubMedArticle;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public PubMedArticle getPubMedArticle() {
		return pubMedArticle;
	}

	public void setPubMedArticle(PubMedArticle pubMedArticle) {
		this.pubMedArticle = pubMedArticle;
	}
}
