/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.roshka.sifen.core.fields.request.event;

import com.roshka.sifen.core.exceptions.SifenException;
import com.roshka.sifen.core.types.PaisType;
import com.roshka.sifen.core.types.TDepartamento;
import com.roshka.sifen.core.types.TiNatRec;
import com.roshka.sifen.core.types.TiTiOpe;
import com.roshka.sifen.core.types.TiTipCont;
import com.roshka.sifen.core.types.TiTipDocRec;
import com.roshka.sifen.internal.response.SifenObjectBase;
import com.roshka.sifen.internal.util.ResponseUtil;
import com.roshka.sifen.internal.util.SifenUtil;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import org.w3c.dom.Node;

/**
 *
 * @author BlackSpider
 */
public class TrGEveNom extends SifenObjectBase{

    private String Id;
    private String mOtEve;
    
    private TiNatRec iNatRec;
    private TiTiOpe iTiOpe;
    private PaisType cPaisRec;
    private TiTipCont iTiContRec;
    private String dRucRec;
    private short dDVRec;
    private TiTipDocRec iTipIDRec;
    private String dDTipIDRec;
    private String dNumIDRec;
    private String dNomRec;
    private String dNomFanRec;
    private String dDirRec;
    private int dNumCasRec;
    private TDepartamento cDepRec;
    private short cDisRec;
    private String dDesDisRec;
    private int cCiuRec;
    private String dDesCiuRec;
    private String dTelRec;
    private String dCelRec;
    private String dEmailRec;
    private String dCodCliente;
    
    public void setupSOAPElements(SOAPElement rEve) throws SOAPException {
        SOAPElement gGroupTiEvt = rEve.addChildElement("rGEveNom");
        
        gGroupTiEvt.addChildElement("Id").setTextContent(this.Id);
        gGroupTiEvt.addChildElement("mOtEve").setTextContent(this.mOtEve);
        
        gGroupTiEvt.addChildElement("iNatRec").setTextContent(String.valueOf(this.iNatRec.getVal()));
        gGroupTiEvt.addChildElement("iTiOpe").setTextContent(String.valueOf(this.iTiOpe.getVal()));
        gGroupTiEvt.addChildElement("cPaisRec").setTextContent(this.cPaisRec.name());
        gGroupTiEvt.addChildElement("dDesPaisRe").setTextContent(this.cPaisRec.getNombre());

        if (this.iNatRec.getVal() == 1) {
            gGroupTiEvt.addChildElement("iTiContRec").setTextContent(String.valueOf(this.iTiContRec.getVal()));
            gGroupTiEvt.addChildElement("dRucRec").setTextContent(this.dRucRec);
            gGroupTiEvt.addChildElement("dDVRec").setTextContent(String.valueOf(this.dDVRec));
        }

        if (this.iNatRec.getVal() == 2) {
            gGroupTiEvt.addChildElement("iTipIDRec").setTextContent(String.valueOf(this.iTipIDRec.getVal()));
            gGroupTiEvt.addChildElement("dDTipIDRec").setTextContent(SifenUtil.coalesce(this.iTipIDRec.getDescripcion(), this.dDTipIDRec));
            gGroupTiEvt.addChildElement("dNumIDRec").setTextContent(SifenUtil.coalesce(this.dNumIDRec, "0"));
        }

        gGroupTiEvt.addChildElement("dNomRec").setTextContent(SifenUtil.coalesce(this.dNomRec, "Sin Nombre"));
        if (this.dNomFanRec != null)
            gGroupTiEvt.addChildElement("dNomFanRec").setTextContent(this.dNomFanRec);

        if (this.dDirRec != null || this.iTiOpe.getVal() == 4) {
            gGroupTiEvt.addChildElement("dDirRec").setTextContent(this.dDirRec);
            gGroupTiEvt.addChildElement("dNumCasRec").setTextContent(String.valueOf(this.dNumCasRec));

            if (this.iTiOpe.getVal() != 4) {
                gGroupTiEvt.addChildElement("cDepRec").setTextContent(String.valueOf(this.cDepRec.getVal()));
                gGroupTiEvt.addChildElement("dDesDepRec").setTextContent(this.cDepRec.getDescripcion());
            }
        }

        if (this.cDisRec != 0) {
            gGroupTiEvt.addChildElement("cDisRec").setTextContent(String.valueOf(this.cDisRec));
            gGroupTiEvt.addChildElement("dDesDisRec").setTextContent(this.dDesDisRec);
        }

        if ((this.dDirRec != null || this.iTiOpe.getVal() == 4) && this.iTiOpe.getVal() != 4) {
            gGroupTiEvt.addChildElement("cCiuRec").setTextContent(String.valueOf(this.cCiuRec));
            gGroupTiEvt.addChildElement("dDesCiuRec").setTextContent(this.dDesCiuRec);
        }

        if (this.dTelRec != null)
            gGroupTiEvt.addChildElement("dTelRec").setTextContent(this.dTelRec);
        if (this.dCelRec != null)
            gGroupTiEvt.addChildElement("dCelRec").setTextContent(this.dCelRec);
        if (this.dEmailRec != null)
            gGroupTiEvt.addChildElement("dEmailRec").setTextContent(this.dEmailRec);
        if (this.dCodCliente != null)
            gGroupTiEvt.addChildElement("dCodCliente").setTextContent(this.dCodCliente);
    }
    
    
    @Override
    public void setValueFromChildNode(Node value) throws SifenException {
       
        switch (value.getLocalName()) {
            
            case "mOtEve":
                this.mOtEve = ResponseUtil.getTextValue(value);
                break;
            
            case "Id":
                this.Id = ResponseUtil.getTextValue(value);
                break;
                
            case "iNatRec":
                this.iNatRec = TiNatRec.getByVal(Short.parseShort(ResponseUtil.getTextValue(value)));
                break;
            case "iTiOpe":
                this.iTiOpe = TiTiOpe.getByVal(Short.parseShort(ResponseUtil.getTextValue(value)));
                break;
            case "cPaisRec":
                this.cPaisRec = PaisType.getByName(ResponseUtil.getTextValue(value));
                break;
            case "iTiContRec":
                this.iTiContRec = TiTipCont.getByVal(Short.parseShort(ResponseUtil.getTextValue(value)));
                break;
            case "dRucRec":
                this.dRucRec = ResponseUtil.getTextValue(value);
                break;
            case "dDVRec":
                this.dDVRec = Short.parseShort(ResponseUtil.getTextValue(value));
                break;
            case "iTipIDRec":
                this.iTipIDRec = TiTipDocRec.getByVal(Short.parseShort(ResponseUtil.getTextValue(value)));
                break;
            case "dDTipIDRec":
                this.dDTipIDRec = ResponseUtil.getTextValue(value);
                break;
            case "dNumIDRec":
                this.dNumIDRec = ResponseUtil.getTextValue(value);
                break;
            case "dNomRec":
                this.dNomRec = ResponseUtil.getTextValue(value);
                break;
            case "dNomFanRec":
                this.dNomFanRec = ResponseUtil.getTextValue(value);
                break;
            case "dDirRec":
                this.dDirRec = ResponseUtil.getTextValue(value);
                break;
            case "dNumCasRec":
                this.dNumCasRec = Integer.parseInt(ResponseUtil.getTextValue(value));
                break;
            case "cDepRec":
                this.cDepRec = TDepartamento.getByVal(Short.parseShort(ResponseUtil.getTextValue(value)));
                break;
            case "cDisRec":
                this.cDisRec = Short.parseShort(ResponseUtil.getTextValue(value));
                break;
            case "dDesDisRec":
                this.dDesDisRec = ResponseUtil.getTextValue(value);
                break;
            case "cCiuRec":
                this.cCiuRec = Integer.parseInt(ResponseUtil.getTextValue(value));
                break;
            case "dDesCiuRec":
                this.dDesCiuRec = ResponseUtil.getTextValue(value);
                break;
            case "dTelRec":
                this.dTelRec = ResponseUtil.getTextValue(value);
                break;
            case "dCelRec":
                this.dCelRec = ResponseUtil.getTextValue(value);
                break;
            case "dEmailRec":
                this.dEmailRec = ResponseUtil.getTextValue(value);
                break;
            case "dCodCliente":
                this.dCodCliente = ResponseUtil.getTextValue(value);
                break;
        }
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getmOtEve() {
        return mOtEve;
    }

    public void setmOtEve(String mOtEve) {
        this.mOtEve = mOtEve;
    }

    public TiNatRec getiNatRec() {
        return iNatRec;
    }

    public void setiNatRec(TiNatRec iNatRec) {
        this.iNatRec = iNatRec;
    }

    public TiTiOpe getiTiOpe() {
        return iTiOpe;
    }

    public void setiTiOpe(TiTiOpe iTiOpe) {
        this.iTiOpe = iTiOpe;
    }

    public PaisType getcPaisRec() {
        return cPaisRec;
    }

    public void setcPaisRec(PaisType cPaisRec) {
        this.cPaisRec = cPaisRec;
    }

    public TiTipCont getiTiContRec() {
        return iTiContRec;
    }

    public void setiTiContRec(TiTipCont iTiContRec) {
        this.iTiContRec = iTiContRec;
    }

    public String getdRucRec() {
        return dRucRec;
    }

    public void setdRucRec(String dRucRec) {
        this.dRucRec = dRucRec;
    }

    public short getdDVRec() {
        return dDVRec;
    }

    public void setdDVRec(short dDVRec) {
        this.dDVRec = dDVRec;
    }

    public TiTipDocRec getiTipIDRec() {
        return iTipIDRec;
    }

    public void setiTipIDRec(TiTipDocRec iTipIDRec) {
        this.iTipIDRec = iTipIDRec;
    }

    public String getdDTipIDRec() {
        return dDTipIDRec;
    }

    public void setdDTipIDRec(String dDTipIDRec) {
        this.dDTipIDRec = dDTipIDRec;
    }

    public String getdNumIDRec() {
        return dNumIDRec;
    }

    public void setdNumIDRec(String dNumIDRec) {
        this.dNumIDRec = dNumIDRec;
    }

    public String getdNomRec() {
        return dNomRec;
    }

    public void setdNomRec(String dNomRec) {
        this.dNomRec = dNomRec;
    }

    public String getdNomFanRec() {
        return dNomFanRec;
    }

    public void setdNomFanRec(String dNomFanRec) {
        this.dNomFanRec = dNomFanRec;
    }

    public String getdDirRec() {
        return dDirRec;
    }

    public void setdDirRec(String dDirRec) {
        this.dDirRec = dDirRec;
    }

    public int getdNumCasRec() {
        return dNumCasRec;
    }

    public void setdNumCasRec(int dNumCasRec) {
        this.dNumCasRec = dNumCasRec;
    }

    public TDepartamento getcDepRec() {
        return cDepRec;
    }

    public void setcDepRec(TDepartamento cDepRec) {
        this.cDepRec = cDepRec;
    }

    public short getcDisRec() {
        return cDisRec;
    }

    public void setcDisRec(short cDisRec) {
        this.cDisRec = cDisRec;
    }

    public String getdDesDisRec() {
        return dDesDisRec;
    }

    public void setdDesDisRec(String dDesDisRec) {
        this.dDesDisRec = dDesDisRec;
    }

    public int getcCiuRec() {
        return cCiuRec;
    }

    public void setcCiuRec(int cCiuRec) {
        this.cCiuRec = cCiuRec;
    }

    public String getdDesCiuRec() {
        return dDesCiuRec;
    }

    public void setdDesCiuRec(String dDesCiuRec) {
        this.dDesCiuRec = dDesCiuRec;
    }

    public String getdTelRec() {
        return dTelRec;
    }

    public void setdTelRec(String dTelRec) {
        this.dTelRec = dTelRec;
    }

    public String getdCelRec() {
        return dCelRec;
    }

    public void setdCelRec(String dCelRec) {
        this.dCelRec = dCelRec;
    }

    public String getdEmailRec() {
        return dEmailRec;
    }

    public void setdEmailRec(String dEmailRec) {
        this.dEmailRec = dEmailRec;
    }

    public String getdCodCliente() {
        return dCodCliente;
    }

    public void setdCodCliente(String dCodCliente) {
        this.dCodCliente = dCodCliente;
    }
    
    
    
}
