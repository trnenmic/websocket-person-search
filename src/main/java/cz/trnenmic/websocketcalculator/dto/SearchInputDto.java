/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.trnenmic.websocketcalculator.dto;

import javax.validation.constraints.Size;

/**
 *
 * @author m
 */
public class SearchInputDto {

    private String forname;
    private String surname;

    public SearchInputDto(String forname, String surname) {
        this.forname = forname;
        this.surname = surname;
    }

    public SearchInputDto() {
    }

    @Size(min = 3, max = 30, message = "Min 3 and max 30 characters")
    public String getForname() {
        return forname;
    }

    public void setForname(String forname) {
        this.forname = forname;
    }

    @Size(min = 3, max = 30, message = "Min 3 and max 30 characters")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


}
