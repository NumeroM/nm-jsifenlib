package com.roshka.sifen.model.de;

import com.roshka.sifen.model.NamespacesConstants;
import com.roshka.sifen.model.de.types.*;

import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import java.math.BigDecimal;

public class TgCamIVA {
    private TiAfecIVA iAfecIVA;
    private BigDecimal dPropIVA;
    private BigDecimal dTasaIVA;
    private BigDecimal dBasGravIVA;
    private BigDecimal dLiqIVAItem;

    public void setupSOAPElements(SOAPElement gCamItem) throws SOAPException {
        SOAPElement gCamIVA = gCamItem.addChildElement("gCamIVA", NamespacesConstants.SIFEN_NS_PREFIX);
        gCamIVA.addChildElement("iAfecIVA", NamespacesConstants.SIFEN_NS_PREFIX).setTextContent(String.valueOf(this.iAfecIVA.getVal()));
        gCamIVA.addChildElement("dDesAfecIVA", NamespacesConstants.SIFEN_NS_PREFIX).setTextContent(this.iAfecIVA.getDescripcion());
        gCamIVA.addChildElement("dPropIVA", NamespacesConstants.SIFEN_NS_PREFIX).setTextContent(String.valueOf(this.dPropIVA));
        gCamIVA.addChildElement("dTasaIVA", NamespacesConstants.SIFEN_NS_PREFIX).setTextContent(String.valueOf(this.dTasaIVA));
        gCamIVA.addChildElement("dBasGravIVA", NamespacesConstants.SIFEN_NS_PREFIX).setTextContent(String.valueOf(this.dBasGravIVA));
        gCamIVA.addChildElement("dLiqIVAItem", NamespacesConstants.SIFEN_NS_PREFIX).setTextContent(String.valueOf(this.dLiqIVAItem));
    }

    public TiAfecIVA getiAfecIVA() {
        return iAfecIVA;
    }

    public void setiAfecIVA(TiAfecIVA iAfecIVA) {
        this.iAfecIVA = iAfecIVA;
    }

    public BigDecimal getdPropIVA() {
        return dPropIVA;
    }

    public void setdPropIVA(BigDecimal dPropIVA) {
        this.dPropIVA = dPropIVA;
    }

    public BigDecimal getdTasaIVA() {
        return dTasaIVA;
    }

    public void setdTasaIVA(BigDecimal dTasaIVA) {
        this.dTasaIVA = dTasaIVA;
    }

    public BigDecimal getdBasGravIVA() {
        return dBasGravIVA;
    }

    public void setdBasGravIVA(BigDecimal dBasGravIVA) {
        this.dBasGravIVA = dBasGravIVA;
    }

    public BigDecimal getdLiqIVAItem() {
        return dLiqIVAItem;
    }

    public void setdLiqIVAItem(BigDecimal dLiqIVAItem) {
        this.dLiqIVAItem = dLiqIVAItem;
    }
}