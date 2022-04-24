package br.com.fiap.abctechservice.handler.exception;

import lombok.Getter;

@Getter
public class MaxAssistsException  extends RuntimeException {
    private String description;

    public MaxAssistsException(String message, String description){
        super(message);
        this.description = description;
    }
}
