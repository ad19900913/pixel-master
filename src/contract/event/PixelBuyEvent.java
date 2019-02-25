package contract.event;

import contract.model.PixelEntity;
import io.nuls.contract.sdk.Address;
import io.nuls.contract.sdk.Event;

public class PixelBuyEvent implements Event {

    private Address buyer;
    private PixelEntity pixelEntity;

    public PixelBuyEvent(Address buyer, PixelEntity pixelEntity) {
        this.buyer = buyer;
        this.pixelEntity = pixelEntity;
    }

    public Address getBuyer() {
        return buyer;
    }

    public void setBuyer(Address buyer) {
        this.buyer = buyer;
    }

    public PixelEntity getPixelEntity() {
        return pixelEntity;
    }

    public void setPixelEntity(PixelEntity pixelEntity) {
        this.pixelEntity = pixelEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PixelBuyEvent that = (PixelBuyEvent) o;

        if (buyer != null ? !buyer.equals(that.buyer) : that.buyer != null) return false;
        return pixelEntity != null ? pixelEntity.equals(that.pixelEntity) : that.pixelEntity == null;
    }

    @Override
    public int hashCode() {
        int result = buyer != null ? buyer.hashCode() : 0;
        result = 31 * result + (pixelEntity != null ? pixelEntity.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"PixelBuyEvent\":{"
                + "\"buyer\":" + buyer
                + ", \"pixelEntity\":" + pixelEntity
                + "}}";
    }
}
