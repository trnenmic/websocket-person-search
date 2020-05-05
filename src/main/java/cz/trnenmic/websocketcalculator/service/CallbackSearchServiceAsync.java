package cz.trnenmic.websocketcalculator.service;

import cz.trnenmic.websocketcalculator.dto.SearchInputDto;
import cz.trnenmic.websocketcalculator.dto.SearchOutputDto;
import cz.trnenmic.websocketcalculator.utils.SleepUtils;
import java.util.function.Consumer;
import javax.ejb.Asynchronous;
import javax.ejb.Stateless;

/**
 *
 * @author m
 */
@Stateless
public class CallbackSearchServiceAsync {

    @Asynchronous
    public void searchPerson(SearchInputDto input, Consumer<SearchOutputDto> callback) {
        System.out.println("Start async processing");
        SleepUtils.sleepSeconds(3);
        int bid = Math.abs((input.getForname() + input.getSurname()).hashCode());
        SearchOutputDto output = new SearchOutputDto(input.getForname(), input.getSurname(), String.valueOf(bid));
        callback.accept(output);
        System.out.println("Async processing finished");
    }
}
