package cz.trnenmic.websocketcalculator.jsf;

import cz.trnenmic.websocketcalculator.dto.SearchInputDto;
import cz.trnenmic.websocketcalculator.dto.SearchOutputDto;
import cz.trnenmic.websocketcalculator.service.CallbackSearchServiceAsync;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.omnifaces.cdi.Push;
import org.omnifaces.cdi.PushContext;

/**
 *
 * @author m
 */
@Named(value = "searchBean")
@SessionScoped
public class SearchBean implements Serializable {

    private SearchInputDto input = new SearchInputDto();
    private SearchOutputDto output = new SearchOutputDto();
    private boolean running = false;

    @Inject
    @Push //(channel = "searchChannel")
    private PushContext searchChannel;

    @Inject
    private CallbackSearchServiceAsync callbackSearchService;

    public SearchBean() {
    }

    public String searchPerson() {
        running = true;
        callbackSearchService.searchPerson(input, message -> {
            output = message;
            searchChannel.send("updateOutput");
            running = false;
        });
        return "index.xhtml?faces-redirect=true";
    }

    public SearchInputDto getInput() {
        return input;
    }

    public void setInput(SearchInputDto input) {
        this.input = input;
    }

    public SearchOutputDto getOutput() {
        return output;
    }

    public void setOutput(SearchOutputDto output) {
        this.output = output;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

}
