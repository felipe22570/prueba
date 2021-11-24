package com.app.appweb.controllers.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

@Entity 
@Table(name = "messages")
public class Messages implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;
    private String messageText;
    
    
    
    @ManyToOne
    @JoinColumn(name = "id")
    @JsonIgnoreProperties({"messages", "reservations"})
    private Partyroom partyroom;

    @ManyToOne
    @JoinColumn(name = "idClient")
    @JsonIgnoreProperties({"messages", "reservations"})
    private Client client;

    
    /*

    public Messages(String messageText) {
        this.messageText = messageText;
    }
    
    
    */
    

    public Integer getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }




    public String getMessageText() {
        return messageText;
    }




    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }


    

    public Partyroom getPartyroom() {
        return partyroom;
    }




    public void setPartyroom(Partyroom partyroom) {
        this.partyroom = partyroom;
    }




    public Client getClient() {
        return client;
    }




    public void setClient(Client client) {
        this.client = client;
    }

    

}