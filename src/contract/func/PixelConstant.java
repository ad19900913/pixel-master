package contract.func;

import contract.util.Nuls;
import io.nuls.contract.sdk.Address;

public interface PixelConstant {
    Address developer = new Address("TTamCgToJMWfhjrLyipfttXbmwpTqVGW");
    Nuls INIT_PRICE = Nuls.ONE;
    short SIZE = 10000;
    short AVAILABLE_HEIGHT = 10000;
    byte START = 1;
    byte STOP = 2;
}
