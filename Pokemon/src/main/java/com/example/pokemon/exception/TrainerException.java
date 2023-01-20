package com.example.pokemon.exception;

public class TrainerException extends Exception   {


    private int errorCode;
    private String errorMessage;

    public TrainerException(int errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
    public enum TrainerExeceptionsEnum {
        INVALID_TRAINER(1, "Invalid Trainer"),
        NO_USERNAME(1, "Invalid Username"),
        NO_PASSWORD(3, "Invalid Password");

        int id;
        String message;


        TrainerExeceptionsEnum(int id, String message) {
            this.id = id;
            this.message = message;
        }

        public int getId() {
            return id;
        }

        public String getMessage() {
            return message;
        }

    }

}
