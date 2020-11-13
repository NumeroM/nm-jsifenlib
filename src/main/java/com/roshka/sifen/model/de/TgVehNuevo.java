package com.roshka.sifen.model.de;

import com.roshka.sifen.model.NamespacesConstants;
import com.roshka.sifen.model.de.types.TiTipCom;
import com.roshka.sifen.model.de.types.TiTipOpVN;

import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import java.math.BigDecimal;

public class TgVehNuevo {
    private TiTipOpVN iTipOpVN;
    private String dChasis;
    private String dColor;
    private short dPotencia;
    private short dCapMot;
    private BigDecimal dPNet;
    private BigDecimal dPBruto;
    private TiTipCom iTipCom;
    private String dDesTipCom;
    private String dNroMotor;
    private BigDecimal dCapTracc;
    private short dAnoFab;
    private String cTipVeh;
    private short dCapac;
    private String dCilin;

    public void setupSOAPElements(SOAPElement gCamItem) throws SOAPException {
        SOAPElement gVehNuevo = gCamItem.addChildElement("gVehNuevo", NamespacesConstants.SIFEN_NS_PREFIX);
        if (this.iTipOpVN != null) {
            gVehNuevo.addChildElement("iTipOpVN", NamespacesConstants.SIFEN_NS_PREFIX).setTextContent(String.valueOf(this.iTipOpVN.getVal()));
            gVehNuevo.addChildElement("dDesTipOpVN", NamespacesConstants.SIFEN_NS_PREFIX).setTextContent(this.iTipOpVN.getDescripcion());
        }

        if (this.dChasis != null)
            gVehNuevo.addChildElement("dChasis", NamespacesConstants.SIFEN_NS_PREFIX).setTextContent(this.dChasis);

        if (this.dColor != null)
            gVehNuevo.addChildElement("dColor", NamespacesConstants.SIFEN_NS_PREFIX).setTextContent(this.dColor);

        if (this.dPotencia != 0)
            gVehNuevo.addChildElement("dPotencia", NamespacesConstants.SIFEN_NS_PREFIX).setTextContent(String.valueOf(this.dPotencia));

        if (this.dCapMot != 0)
            gVehNuevo.addChildElement("dCapMot", NamespacesConstants.SIFEN_NS_PREFIX).setTextContent(String.valueOf(this.dCapMot));

        if (this.dPNet != null)
            gVehNuevo.addChildElement("dPNet", NamespacesConstants.SIFEN_NS_PREFIX).setTextContent(String.valueOf(this.dPNet));

        if (this.dPBruto != null)
            gVehNuevo.addChildElement("dPBruto", NamespacesConstants.SIFEN_NS_PREFIX).setTextContent(String.valueOf(this.dPBruto));

        if (this.iTipOpVN != null) {
            gVehNuevo.addChildElement("iTipCom", NamespacesConstants.SIFEN_NS_PREFIX).setTextContent(String.valueOf(this.iTipCom.getVal()));
            gVehNuevo.addChildElement("dDesTipCom", NamespacesConstants.SIFEN_NS_PREFIX).setTextContent(
                    this.iTipCom.getDescripcion() != null ? this.iTipCom.getDescripcion() : this.dDesTipCom
            );
        }

        if (this.dNroMotor != null)
            gVehNuevo.addChildElement("dNroMotor", NamespacesConstants.SIFEN_NS_PREFIX).setTextContent(this.dNroMotor);

        if (this.dCapTracc != null)
            gVehNuevo.addChildElement("dCapTracc", NamespacesConstants.SIFEN_NS_PREFIX).setTextContent(String.valueOf(this.dCapTracc));

        if (this.dAnoFab != 0)
            gVehNuevo.addChildElement("dAnoFab", NamespacesConstants.SIFEN_NS_PREFIX).setTextContent(String.valueOf(this.dAnoFab));

        if (this.cTipVeh != null)
            gVehNuevo.addChildElement("cTipVeh", NamespacesConstants.SIFEN_NS_PREFIX).setTextContent(this.cTipVeh);

        if (this.dCapac != 0)
            gVehNuevo.addChildElement("dCapac", NamespacesConstants.SIFEN_NS_PREFIX).setTextContent(String.valueOf(this.dCapac));

        if (this.dCilin != null)
            gVehNuevo.addChildElement("dCilin", NamespacesConstants.SIFEN_NS_PREFIX).setTextContent(this.dCilin);
    }

    public TiTipOpVN getiTipOpVN() {
        return iTipOpVN;
    }

    public void setiTipOpVN(TiTipOpVN iTipOpVN) {
        this.iTipOpVN = iTipOpVN;
    }

    public String getdChasis() {
        return dChasis;
    }

    public void setdChasis(String dChasis) {
        this.dChasis = dChasis;
    }

    public String getdColor() {
        return dColor;
    }

    public void setdColor(String dColor) {
        this.dColor = dColor;
    }

    public short getdPotencia() {
        return dPotencia;
    }

    public void setdPotencia(short dPotencia) {
        this.dPotencia = dPotencia;
    }

    public short getdCapMot() {
        return dCapMot;
    }

    public void setdCapMot(short dCapMot) {
        this.dCapMot = dCapMot;
    }

    public BigDecimal getdPNet() {
        return dPNet;
    }

    public void setdPNet(BigDecimal dPNet) {
        this.dPNet = dPNet;
    }

    public BigDecimal getdPBruto() {
        return dPBruto;
    }

    public void setdPBruto(BigDecimal dPBruto) {
        this.dPBruto = dPBruto;
    }

    public TiTipCom getiTipCom() {
        return iTipCom;
    }

    public void setiTipCom(TiTipCom iTipCom) {
        this.iTipCom = iTipCom;
    }

    public String getdDesTipCom() {
        return dDesTipCom;
    }

    public void setdDesTipCom(String dDesTipCom) {
        this.dDesTipCom = dDesTipCom;
    }

    public String getdNroMotor() {
        return dNroMotor;
    }

    public void setdNroMotor(String dNroMotor) {
        this.dNroMotor = dNroMotor;
    }

    public BigDecimal getdCapTracc() {
        return dCapTracc;
    }

    public void setdCapTracc(BigDecimal dCapTracc) {
        this.dCapTracc = dCapTracc;
    }

    public short getdAnoFab() {
        return dAnoFab;
    }

    public void setdAnoFab(short dAnoFab) {
        this.dAnoFab = dAnoFab;
    }

    public String getcTipVeh() {
        return cTipVeh;
    }

    public void setcTipVeh(String cTipVeh) {
        this.cTipVeh = cTipVeh;
    }

    public short getdCapac() {
        return dCapac;
    }

    public void setdCapac(short dCapac) {
        this.dCapac = dCapac;
    }

    public String getdCilin() {
        return dCilin;
    }

    public void setdCilin(String dCilin) {
        this.dCilin = dCilin;
    }

}