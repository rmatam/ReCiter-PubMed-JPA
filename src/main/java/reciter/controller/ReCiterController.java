package reciter.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import reciter.model.pubmed.PubMedArticle;
import reciter.service.PubMedService;

@Controller
public class ReCiterController {

	private static final Logger slf4jLogger = LoggerFactory.getLogger(ReCiterController.class);

	@Autowired
	private PubMedService pubMedService;
	
	@RequestMapping(value = "/reciter/save/pubmed/articles/", method = RequestMethod.POST)
	public void savePubMedArticles(@RequestBody List<PubMedArticle> pubMedArticles) {

		slf4jLogger.info("calling savePubMedArticles with numberOfPubmedArticles=[" + pubMedArticles.size() + "]");
		pubMedService.save(pubMedArticles);
	}
}

