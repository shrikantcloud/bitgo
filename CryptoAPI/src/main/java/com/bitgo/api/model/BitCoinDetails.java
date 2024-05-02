package com.bitgo.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter
public class BitCoinDetails {

    @JsonProperty("currentPrice")
    private double currentPrice;
    @JsonProperty("dailyPercentageChange")
    private double dailyPercentageChange;
    @JsonProperty("tradingVolume")
    private double tradingVolume;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BitCoinDetails that = (BitCoinDetails) o;
        return Double.compare(that.currentPrice, currentPrice) == 0 && Double.compare(that.dailyPercentageChange, dailyPercentageChange) == 0 && Double.compare(that.tradingVolume, tradingVolume) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentPrice, dailyPercentageChange, tradingVolume);
    }
}
