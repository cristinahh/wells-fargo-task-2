package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private long clientId ;

    @Column(nullable = false)
    private long creationDate;

    protected Portfolio() {

    }

    public Portfolio( long clientId, long creationDate) {
        this.creationDate = creationDate;
        this.clientId = clientId;
    }

    public long getPortfolioID() { return portfolioId;}

    public long getClientID() {return clientId;}

    public void setClientId(long clientId) {this.clientId = clientId;}

    public long getCreationDate() { return creationDate; }

    public void setCreationDate(long creationDate) { this.creationDate = creationDate; }


}