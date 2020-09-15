package com.urunov.model.simple;

import com.sun.istack.NotNull;
import com.urunov.model.bulkbatch.Dimensions;
import com.urunov.model.bulkbatch.Weight;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Future;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: apple
 * @created on 14/09/2020
 * @Project is BillingSystem
 */

@Entity
public class Item {

    @Id
    @GeneratedValue(generator = "ID_GENERATOR")
    private Long id;

    public Long getId() {
        return id;
    }

    @NotNull
    @Size(
            min=2,
            max=255,
            message = "Name is require, maximum 255 characters."
        )
    private String name;

    private BigDecimal initialPrice;

    @Future
    protected Date auctionEnd;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getAuctionEnd() {
        return auctionEnd;
    }

    public void setAuctionEnd(Date auctionEnd) {
        this.auctionEnd = auctionEnd;
    }

    protected BigDecimal buyNowPrice;

    public BigDecimal getBuyNowPrice() {
        return buyNowPrice;
    }

    public void setBuyNowPrice(BigDecimal buyNowPrice) {
        this.buyNowPrice = buyNowPrice;
    }

    @Transient
    protected Set<Bid> bids = new HashSet<Bid>();

    public Set<Bid> getBids() {
        return bids;
    }

    public void setBids(Set<Bid> bids) {
        this.bids = bids;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    protected Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void addBid(Bid bid) {
        // Be defensive
        if (bid == null)
            throw new NullPointerException("Can't add null Bid");
        if (bid.getItem() != null)
            throw new IllegalStateException("Bid is already assigned to an Item");

        getBids().add(bid);
        bid.setItem(this);
    }

    public Bid placeBid(Bid currentHighestBid, BigDecimal bidAmount) {
        if (currentHighestBid == null ||
                bidAmount.compareTo(currentHighestBid.getAmount()) > 0) {
            return new Bid(bidAmount, this);
        }
        return null;
    }
}
