package com.roshka.sifen.core.types;

import java.util.Arrays;

public enum TcUniMed {
    m("m", (short) 87, "Metros - m", "Metros"),
    CPM("CPM", (short) 2366, "Costo Por Mil - CPM", "Costo Por Mil"),
    UI("UI", (short) 2329, "Unidad Internacional - UI", "Unidad Internacional"),
    M3("M3", (short) 110, "Metros cúbicos - M3", "Metros cúbicos"),
    UNI("UNI", (short) 77, "Unidad - UNI", "Unidad"),
    g("g", (short) 86, "Gramos - g", "Gramos"),
    LT("LT", (short) 89, "Litros - LT", "Litros"),
    MG("MG", (short) 90, "Miligramos - MG", "Miligramos"),
    CM("CM", (short) 91, "Centimetros - CM", "Centimetros"),
    CM2("CM2", (short) 92, "Centimetros cuadrados - CM2", "Centimetros cuadrados"),
    CM3("CM3", (short) 93, "Centimetros cubicos - CM3", "Centimetros cubicos"),
    PUL("PUL", (short) 94, "Pulgadas - PUL", "Pulgadas"),
    MM2("MM2", (short) 96, "Milímetros cuadrados - MM2", "Milímetros cuadrados"),
    kg_m2("kg/m2", (short) 79, "Kilogramos s/ metro cuadrado - kg/m2", "Kilogramos s/ metro cuadrado"),
    AA("AA", (short) 97, "Año - AA", "Año"),
    ME("ME", (short) 98, "Mes - ME", "Mes"),
    TN("TN", (short) 99, "Tonelada - TN", "Tonelada"),
    Hs("Hs", (short) 100, "Hora - Hs", "Hora"),
    Mi("Mi", (short) 101, "Minuto - Mi", "Minuto"),
    DET("DET", (short) 104, "Determinación - DET", "Determinación"),
    Ya("Ya", (short) 103, "Yardas - Ya", "Yardas"),
    MT("MT", (short) 108, "Metros - MT", "Metros"),
    M2("M2", (short) 109, "Metros cuadrados - M2", "Metros cuadrados"),
    MM("MM", (short) 95, "Milímetros - MM", "Milímetros"),
    Se("Se", (short) 666, "Segundo - Se", "Segundo"),
    Di("Di", (short) 102, "Día - Di", "Día"),
    kg("kg", (short) 83, "Kilogramos - kg", "Kilogramos"),
    ML("ML", (short) 88, "Mililitros - ML", "Mililitros"),
    Km("Km", (short) 625, "Kilómetros - Km", "Kilómetros"),
    ml("ml", (short) 660, "Metro lineal - ml", "Metro lineal"),
    GL("GL", (short) 885, "Unidad Medida Global - GL", "Unidad Medida Global"),
    pm("pm", (short) 891, "Por Milaje - pm", "Por Milaje"),
    ha("ha", (short) 869, "Hectáreas - ha", "Hectáreas"),
    racion("ración", (short) 569, "Ración - ración", "Ración"),
    _4A("4A", (short) 111, "Bovinas - 4A", "Bovinas"),
    Ci("Ci", (short) 112, "Curie - Ci", "Curie"),
    DOC("DOC", (short) 113, "Docena - DOC", "Docena"),
    GLL("GLL", (short) 114, "Galones (US) (3,7843 LT) - GLL", "Galones (US) (3,7843 LT)"),
    GRO("GRO", (short) 115, "Gruesas - GRO", "Gruesas"),
    E4("E4", (short) 116, "Kilogramo Bruto - E4", "Kilogramo Bruto"),
    KT("KT", (short) 117, "Kits - KT", "Kits"),
    M5("M5", (short) 118, "Microcurie - M5", "Microcurie"),
    MCU("MCU", (short) 119, "Milicurie - MCU", "Milicurie"),
    MIL("MIL", (short) 120, "Millar - MIL", "Millar"),
    PAR("PAR", (short) 121, "Par - PAR", "Par"),
    FOT("FOT", (short) 122, "Pies - FOT", "Pies"),
    FTK("FTK", (short) 123, "Pies Cuadradas - FTK", "Pies Cuadradas"),
    PCE("PCE", (short) 124, "Piezas - PCE", "Piezas"),
    KLT("KLT", (short) 125, "Quilate - KLT", "Quilate"),
    RM("RM", (short) 126, "Resmas - RM", "Resmas"),
    RO("RO", (short) 127, "Rollos - RO", "Rollos"),
    kWh("kWh", (short) 128, "1000 Kilowatt Hora - kWh", "1000 Kilowatt Hora"),
    UJGO("U(JGO)", (short) 129, "Mazoz - U(JGO)", "Mazoz"),
    DR("DR", (short) 130, "Tambores - DR", "Tambores"),
    BX("BX", (short) 131, "Caja - BX", "Caja"),
    SET("SET", (short) 132, "Juego - SET", "Juego"),
    PK("PK", (short) 133, "Paquete - PK", "Paquete"),
    BG("BG", (short) 134, "Bolsa - BG", "Bolsa"),
    DPC("DPC", (short) 135, "Docena Par - DPC", "Docena Par"),
    JR("JR", (short) 136, "Pote - JR", "Pote"),
    BL("BL", (short) 137, "Fardos - BL", "Fardos"),
    AB("AB", (short) 138, "Bulto - AB", "Bulto"),
    BK("BK", (short) 139, "Cesta - BK", "Cesta"),
    BW("BW", (short) 140, "Peso Base - BW", "Peso Base");
    

    private String abreviatura;
    private short val;
    private String documentacion;
    private String descripcion;

    TcUniMed(String abreviatura, short val, String documentacion, String descripcion) {
        this.abreviatura = abreviatura;
        this.val = val;
        this.documentacion = documentacion;
        this.descripcion = descripcion;
    }

    public static TcUniMed getByVal(short val) {
        return Arrays.stream(TcUniMed.values()).filter(e -> e.val == val).findFirst().orElse(null);
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public short getVal() {
        return val;
    }

    public String getDocumentacion() {
        return documentacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "{\"abreviatura\": \"" + abreviatura + "\", \"val\": " + val + ", \"documentacion\": \"" + documentacion + "\", \"descripcion\": \"" + descripcion + "\"}";
    }
}