package cz.trnenmic.websocketcalculator.dto;

/**
 *
 * @author m
 */
public class SearchOutputDto {

    private String forname;
    private String surname;
    private String bid;

    public SearchOutputDto(String forname, String surname, String bid) {
        this.forname = forname;
        this.surname = surname;
        this.bid = bid;
    }

    public SearchOutputDto() {
    }

    public String getForname() {
        return forname;
    }

    public void setForname(String forname) {
        this.forname = forname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

}
